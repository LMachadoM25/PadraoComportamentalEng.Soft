package TemplateMethod;

class PagamentoBoleto extends Pagamento {
    public PagamentoBoleto(int saldo, int valor) {
        super(saldo, valor);
    }

    @Override
    protected void realizarPagamento() {
        saldo = saldo - valor;
        System.out.println("Processando pagamento via boleto\n" +
                "Pagamento concluido\n" +
                "Seu saldo é de " + saldo);
    }
}