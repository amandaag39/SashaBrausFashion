package sashabrausfashion.clothing;

import sashabrausfashion.models.Product;
import sashabrausfashion.models.Review;

public class Dresses extends Product {
    private String dressesType;

    public Dresses(String name, double price, String size, String color, double weight, String description, String dressesType) {
        super(name, price, size, color, weight, description);
        this.dressesType = dressesType;
    }

    public String getDressesType() {
        return dressesType;
    }

    public void setType(String dressesType) {
        this.dressesType = dressesType;
    }

    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + dressesType + ".");
    }

    @Override
    public void removeReview(Review review) {

    }
}

