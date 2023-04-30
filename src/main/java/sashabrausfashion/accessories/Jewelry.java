package sashabrausfashion.accessories;

import sashabrausfashion.models.Product;
import sashabrausfashion.models.Review;

public class Jewelry extends Product {
    private String jewelryType;

    public Jewelry (String name, double price, String size, String color, double weight, String description, String jewelryType) {
        super(name, price, size, color, weight, description);
        this.jewelryType = jewelryType;
    }

    public String getJewelryType() {
        return jewelryType;
    }

    public void setJewelryType(String jewelryType){
        this.jewelryType = jewelryType;
    }

    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + jewelryType + ".");
    }

    @Override
    public void removeReview(Review review) {

    }
}

