
package TemplateMethod;

public class Main {
    public static void main(String[] args) {

        Pagamento pagamentoBoleto = new PagamentoBoleto(1100,230);
        Pagamento pagamentoPix = new PagamentoPix(1000, 300);
        Pagamento pagamentoCartão = new PagamentoCartão(900, 600);

        System.out.println("Pix");
        pagamentoPix.processarPagamento();
        System.out.println("Fim Pix");


        System.out.println("Boleto");
        pagamentoBoleto.processarPagamento();
        System.out.println("Fim Boleto");


        System.out.println("Cartão");
        pagamentoCartão.processarPagamento();
        System.out.println("Fim Cartão");
    }
}