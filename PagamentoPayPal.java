package strategy;

public class PagamentoPayPal implements PagamentoStrategy {
    private String email;
    private String senha;

    public PagamentoPayPal(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public void pagar(double quantia) {
        System.out.println("Pagamento de R$" + quantia + " realizado com PayPal.");
    }
}