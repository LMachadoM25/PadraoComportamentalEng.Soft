package TemplateMethod;

class PagamentoPix extends Pagamento {
    public PagamentoPix(int saldo, int valor) {
        super(saldo, valor);
    }
    @Override
    protected void realizarPagamento() {
        saldo = saldo - valor;
        System.out.println("Processando pagamento via Pix\n" +
                "Pagamento concluido\n" +
                "Seu saldo é de " + saldo);
    }
}