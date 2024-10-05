package aulas.dez.atv01;

public class Product {

    private String name;
    private Stock stock;

    public Product(String name, Stock stock) {
        this.name = name;
        this.stock = stock;
        this.stock.addProduct(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
