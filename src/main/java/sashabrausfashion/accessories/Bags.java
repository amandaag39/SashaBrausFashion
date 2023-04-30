package sashabrausfashion.accessories;

import sashabrausfashion.models.Product;
import sashabrausfashion.models.Review;

public class Bags extends Product {
    private String bagsType;

    public Bags(String name, double price, String size, String color, double weight, String description, String bagsType) {
        super(name, price, size, color, weight, description);
        this.bagsType = bagsType;
    }

    public String getBagsType() {
        return bagsType;
    }

    public void setType(String bagsType) {
        this.bagsType = bagsType;
    }

    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + bagsType + ".");
    }

    @Override
    public void removeReview(Review review) {

    }
}