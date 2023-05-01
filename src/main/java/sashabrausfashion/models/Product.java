package main.java.sashabrausfashion.models;

import main.java.sashabrausfashion.utilities.Reviewable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Product implements Reviewable {
    protected String name;
    protected double price;
    protected String size;
    protected String color;
    protected double weight;
    protected String description;
    protected List<Review> reviews;

    public Product(String name, double price, String size, String color, double weight, String description) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
        this.weight = weight;
        this.description = description;
        this.reviews = new ArrayList<>();
    }

    public abstract void printDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public List<Review> getReviews() {
        List<Review> reviewList = new ArrayList<>(reviews);
        return reviewList;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        long priceBits = Double.doubleToLongBits(price);
        result = 31 * result + (int) (priceBits ^ (priceBits >>> 32));
        result = 31 * result + size.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return Double.compare(other.price, price) == 0 &&
                Objects.equals(name, other.name) &&
                Objects.equals(size, other.size) &&
                Objects.equals(color, other.color);
    }

}