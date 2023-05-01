package main.java.sashabrausfashion.models;

import main.java.sashabrausfashion.utilities.Cartable;

public class CartItem implements Cartable {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public  double getPrice() {
        return product.getPrice();
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public String getDescription() {
        return product.getDescription();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getWeight() {
        return product.getWeight() * quantity;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Cart Item{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
