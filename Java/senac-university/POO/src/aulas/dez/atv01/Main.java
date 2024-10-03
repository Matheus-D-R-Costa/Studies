package aulas.dez.atv01;

public class Main {

    public static void main(String[] args) {

        Stock myStock = new Stock();
        Product prd01 = new Product("Detergente", myStock);
        Product prd02 = new Product("Rolex", myStock);
        Product prd03 = new Product("Caixa Misteriosa", myStock);
        Product prd04 = new Product("Bola de Futebol", myStock);

        System.out.println(myStock.getProducts());

    }
}
