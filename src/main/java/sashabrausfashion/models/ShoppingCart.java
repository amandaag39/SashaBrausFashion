package sashabrausfashion.models;

import sashabrausfashion.utilities.Cartable;
import sashabrausfashion.utilities.DiscountCalculator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements DiscountCalculator {

    private List<Cartable> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(Cartable item) {
        cartItems.add(item);
    }

    public void removeItem(Cartable item) {
        cartItems.remove(item);
    }


    public double getTotal() {
        double total = 0.0;
        for (Cartable item: cartItems) {
            CartItem cartItem = (CartItem) item;
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    @Override
    public double calculateDiscount(CartItem item) {
        double totalDiscount = 0.0;
        for (Cartable cartItem : cartItems) {
            totalDiscount += ((DiscountCalculator) cartItem).calculateDiscount(item);
        }
        return totalDiscount;
    }

}
