package aulas.doze;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {

    private static final AtomicInteger count = new AtomicInteger(0);
    private final Integer ID;
    private String name;
    private Stock stock;
    private Boolean isSold;

    public Product(String name, Stock stock) {
        this.ID = count.incrementAndGet();
        this.name = name;
        this.stock = stock;
        this.stock.addProduct(this);
        this.isSold = false;
    }

    public boolean isSold() {
        return isSold;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Stock getStock() {
        return stock;
    }

    public Boolean getSold() {
        return isSold;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void setSold(Boolean sold) {
        isSold = sold;
    }
}
