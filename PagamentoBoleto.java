package strategy;

public class PagamentoBoleto implements PagamentoStrategy {

    @Override
    public void pagar(double quantia) {
        System.out.println("Pagamento de R$" + quantia + " realizado com boleto bancário.");
    }
}