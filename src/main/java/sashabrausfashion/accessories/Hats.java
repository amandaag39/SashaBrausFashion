package sashabrausfashion.accessories;


import sashabrausfashion.models.Product;
import sashabrausfashion.models.Review;

public class Hats extends Product {
    private String hatsType;

    public Hats (String name, double price, String size, String color, double weight, String description, String hatsType) {
        super(name, price, size, color, weight, description);
        this.hatsType = hatsType;
    }

    public String getHatsType() {
        return hatsType;
    }

    public void setHatsType(String hatsType) {
        this.hatsType = hatsType;
    }

    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + hatsType + "hat.");
    }

    @Override
    public void removeReview(Review review) {

    }
}
