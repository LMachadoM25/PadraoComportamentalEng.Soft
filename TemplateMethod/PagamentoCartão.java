package TemplateMethod;

class PagamentoCartão extends Pagamento {

    public PagamentoCartão(int saldo, int valor) {
        super(saldo, valor);
    }
    @Override
     protected void realizarPagamento() {
        saldo = saldo - valor;
        System.out.println("Processando pagamento via cartão\n" +
                "Pagamento concluido\n" +
                "Seu saldo é de " + saldo);
    }
}