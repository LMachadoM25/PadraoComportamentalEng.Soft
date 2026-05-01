// 1. Element interface
interface Animal {
  void accept(Visitor visitor);
}

// 2. Concrete elements
class Cachorro implements Animal {
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this); // Double Dispatch
  }
}

class Gato implements Animal {
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this); // Double Dispatch
  }
}

// 3. Visitor interface
interface Visitor {
  void visit(Cachorro cachorro);
  void visit(Gato gato);
}

// 4. Concrete visitors
// Operação 1: emitir sons
class SomVisitor implements Visitor {
  @Override
  public void visit(Cachorro cachorro) {
    System.out.println("Cachorro: Au au!");
  }

  @Override
  public void visit(Gato gato) {
    System.out.println("Gato: Miau!");
  }
}

// Operação 2: descrever o animal
class DescricaoVisitor implements Visitor {
  @Override
  public void visit(Cachorro cachorro) {
    System.out.println("Cachorro: animal doméstico, leal e brincalhão.");
  }

  @Override
  public void visit(Gato gato) {
    System.out.println("Gato: animal doméstico, independente e curioso.");
  }
}

// 5. Client
public class Main {
  public static void main(String[] args) {
    Animal[] animais = { new Cachorro(), new Gato() };

    System.out.println("=== Sons ===");
    SomVisitor som = new SomVisitor();
    for (Animal animal : animais) {
      animal.accept(som);
    }

    System.out.println("\n=== Descrições ===");
    DescricaoVisitor descricao = new DescricaoVisitor();
    for (Animal animal : animais) {
      animal.accept(descricao);
    }
  }
}