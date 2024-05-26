package strategy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1. Cartão de Crédito");
        System.out.println("2. PayPal");
        System.out.println("3. Boleto Bancário");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                scanner.nextLine(); // Consome a nova linha
                System.out.println("Número do Cartão:");
                String numeroCartao = scanner.nextLine();
                System.out.println("Nome do Titular:");
                String nomeTitular = scanner.nextLine();
                System.out.println("Data de Validade:");
                String dataValidade = scanner.nextLine();
                System.out.println("CVV:");
                String cvv = scanner.nextLine();
                carrinho.setEstrategiaPagamento(new PagamentoCartaoCredito(numeroCartao, nomeTitular, dataValidade, cvv));
                break;
            case 2:
                scanner.nextLine(); // Consome a nova linha
                System.out.println("Email:");
                String email = scanner.nextLine();
                System.out.println("Senha:");
                String senha = scanner.nextLine();
                carrinho.setEstrategiaPagamento(new PagamentoPayPal(email, senha));
                break;
            case 3:
                carrinho.setEstrategiaPagamento(new PagamentoBoleto());
                break;
            default:
                System.out.println("Método de pagamento inválido.");
                return;
        }

        System.out.println("Digite o valor da compra:");
        double quantia = scanner.nextDouble();

        carrinho.pagarCompra(quantia);
        scanner.close();
    }
}