package aulas.dez.atv01;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Product> products;

    public Stock() {
        this.products = new ArrayList<>();
    }

    public boolean verifySize() {
        return products.size() < 5;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "products=" + products +
                '}';
    }
}
