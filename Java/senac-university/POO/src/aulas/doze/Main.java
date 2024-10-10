package aulas.doze;


public class Main {

    public static void main(String[] args) {
        Stock myStock = new Stock();
        Product prd01 = new Product("Detergente", myStock);
        Product prd02 = new Product("Rolex", myStock);
        Product prd03 = new Product("Caixa Misteriosa", myStock);
        Product prd04 = new Product("Bola de Futebol", myStock);

        myStock.addProduct(prd01);
        myStock.addProduct(prd02);
        myStock.addProduct(prd03);
        myStock.addProduct(prd04);

        buyProductByName("Rolex", myStock);
        buyProductByName("Bola de Futebol", myStock);
        System.out.println(prd02.isSold());
    }

    private static void buyProductByName(String productName, Stock stock) {
        if (!stock.isProductExistsByName(productName)) {
            System.out.println("Produto não existente no estoque...");
            return;
        }

        stock.getProducts().stream()
                .filter(product -> product.getName().equalsIgnoreCase(productName) && !product.isSold())
                .findFirst()
                .ifPresentOrElse(product -> {
                    product.setSold(true);
                    System.out.println("Produto " + product.getName() + " foi comprado com sucesso.");
                }, () -> System.out.println("Produto já foi vendido ou não encontrado."));
    }
}
