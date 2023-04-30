package sashabrausfashion.utilities;


import sashabrausfashion.models.CartItem;

public interface DiscountCalculator {
    double calculateDiscount(CartItem item);
}