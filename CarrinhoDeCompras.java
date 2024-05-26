package strategy;

public class CarrinhoDeCompras {
    private PagamentoStrategy estrategiaPagamento;

    public void setEstrategiaPagamento(PagamentoStrategy estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public void pagarCompra(double quantia) {
        estrategiaPagamento.pagar(quantia);
    }
}