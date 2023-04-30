package sashabrausfashion.clothing;

import sashabrausfashion.models.Product;
import sashabrausfashion.models.Review;

public class Tops extends Product {
    private String topsType;

    public Tops(String name, double price, String size, String color, double weight, String description, String topsType) {
        super(name, price, size, color, weight, description);
        this.topsType = topsType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTopsType() {
        return topsType;
    }
    public void setTopsType(String topsType){
        this.topsType = topsType;
    }

    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + topsType + ".");
    }

    @Override
    public void removeReview(Review review) {

    }
}
