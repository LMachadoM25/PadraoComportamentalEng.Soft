package TemplateMethod;
public abstract class Pagamento {

    protected int saldo;
    protected int valor;

    public Pagamento(int saldo, int valor) {
        this.saldo = saldo;
        this.valor = valor;
    }

    public void processarPagamento() {
        validarDados();
        realizarPagamento();
        gerarComprovante();
    }
    protected void validarDados() {
        System.out.println("Validando dados do pagamento...");
    }
    protected abstract void realizarPagamento();

    protected void gerarComprovante() {
        System.out.println("Gerando comprovante...");
    }
}