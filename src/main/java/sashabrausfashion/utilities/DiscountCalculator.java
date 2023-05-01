package main.java.sashabrausfashion.utilities;


import main.java.sashabrausfashion.models.CartItem;

public interface DiscountCalculator {
    double calculateDiscount(CartItem item);
}