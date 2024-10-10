package dsa.um;

public class CalculoVariaveis {

    public static void main(String[] args) {
        double precoUnitario = 2.5;
        int quantidade = 10;
        double desconto = 0.1;
        double imposto = 0.05;

        double subtotal = precoUnitario * quantidade;
        double valorDesconto = subtotal * desconto;
        double valorImposto = subtotal * imposto;
        double total = subtotal - valorDesconto + valorImposto;

        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: R$" + precoUnitario);
        System.out.println("Subtotal: R$" + subtotal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Imposto: R$" + valorImposto);
        System.out.println("Total: R$" + total);

    }

}
