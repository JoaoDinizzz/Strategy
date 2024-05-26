package strategy;

public class PagamentoCartaoCredito implements PagamentoStrategy {
    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private String cvv;

    public PagamentoCartaoCredito(String numeroCartao, String nomeTitular, String dataValidade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }

    @Override
    public void pagar(double quantia) {
        System.out.println("Pagamento de R$" + quantia + " realizado com cartão de crédito.");
    }
}