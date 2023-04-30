package sashabrausfashion.clothing;

import sashabrausfashion.models.Product;
import sashabrausfashion.models.Review;

public class Bottoms extends Product {
    private String bottomsType;

    public Bottoms(String name, double price, String size, String color, double weight, String description,  String bottomsType) {
        super(name, price, size, color, weight, description);
        this.bottomsType = bottomsType;
    }

    public String getBottomsType() {
        return bottomsType;
    }
    public void setType(String bottomsType) {
        this.bottomsType = bottomsType;
    }

    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + bottomsType + ".");

    }

    @Override
    public void removeReview(Review review) {

    }
}

