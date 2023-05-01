package main.java.sashabrausfashion.models;

import main.java.sashabrausfashion.utilities.Cartable;
import main.java.sashabrausfashion.utilities.DiscountCalculator;
import main.java.sashabrausfashion.custom.CustomLinkedList;

public class ShoppingCart implements DiscountCalculator {

    private CustomLinkedList<Cartable> cartItems;

    public ShoppingCart() {
        cartItems = new CustomLinkedList<>();
    }

    public void addItem(Cartable item) {
        cartItems.add(item);
    }

    public void removeItem(Cartable item) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).equals(item)) {
                cartItems.remove(i);
                break;
            }
        }
    }

    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < cartItems.size(); i++) {
            Cartable item = cartItems.get(i);
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    @Override
    public double calculateDiscount(CartItem item) {
        double totalDiscount = 0.0;
        for (int i = 0; i < cartItems.size(); i++) {
            Cartable cartItem = cartItems.get(i);
            if (cartItem instanceof DiscountCalculator) {
                totalDiscount += ((DiscountCalculator) cartItem).calculateDiscount(item);
            }
        }
        return totalDiscount;
    }
}

//package main.java.sashabrausfashion.models;
//
//import main.java.sashabrausfashion.utilities.Cartable;
//import main.java.sashabrausfashion.utilities.DiscountCalculator;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ShoppingCart implements DiscountCalculator {
//
//    private List<Cartable> cartItems;
//
//    public ShoppingCart() {
//        cartItems = new ArrayList<>();
//    }
//
//    public void addItem(Cartable item) {
//        cartItems.add(item);
//    }
//
//    public void removeItem(Cartable item) {
//        cartItems.remove(item);
//    }
//
//
//    public double getTotal() {
//        double total = 0.0;
//        for (Cartable item: cartItems) {
//            CartItem cartItem = (CartItem) item;
//            total += item.getPrice() * item.getQuantity();
//        }
//        return total;
//    }
//
//    @Override
//    public double calculateDiscount(CartItem item) {
//        double totalDiscount = 0.0;
//        for (Cartable cartItem : cartItems) {
//            totalDiscount += ((DiscountCalculator) cartItem).calculateDiscount(item);
//        }
//        return totalDiscount;
//    }
//
//}
