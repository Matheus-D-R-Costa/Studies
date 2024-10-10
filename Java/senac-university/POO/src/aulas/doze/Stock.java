package aulas.doze;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Product> products;

    public Stock() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public boolean isProductExistsByName(String name) {
        return this.products.stream()
                .anyMatch(product -> product.getName().equalsIgnoreCase(name));
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
