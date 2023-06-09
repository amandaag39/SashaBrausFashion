package sashabrausfashion.models;

import sashabrausfashion.utilities.Reviewable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.*;
import java.util.stream.Collectors;

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

    public Product() {

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

    //Lesson 9: lambda function method declarations

    // 1. Predicate
    public Predicate<Product> underOneHundred() {
        //default implementation
        return p -> p.getPrice() < 100.0;
    }

    // 2. Consumer
    public Consumer<Product> printName() {
        return p -> System.out.println(p.getName());
    }

    // 3. Function
    public Function<Product,String> getDescriptionFunction() {
        return product -> product.getDescription();
    }

    // 4. Supplier

    protected abstract Supplier<Product> getProductSupplier();

    public List<Product> createProducts(int numProducts) {
        List<Product> products = new ArrayList<>();
        Supplier<Product> productSupplier = getProductSupplier();

        for (int i = 0; i < numProducts; i++) {
            products.add(productSupplier.get());
        }
        return products;
    }

    // 5. UnaryOperator
    public double applyTax(UnaryOperator<Double> taxOperator) {
        double priceWithTax = taxOperator.apply(price);
        return priceWithTax;
    }


    //Lesson 10: Collections Streaming (collections streaming pipeline)
    public abstract List<Product> getProductList();
        public void printFilteredProductsByPriceRange(double minPrice, double maxPrice) {
            getProductList().stream()
                .filter(product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
                .distinct()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .limit(3)
                .peek(product -> System.out.println("Filtered Product: " + product.getName() + ", Price: " + product.getPrice()))
                .map(product -> "Name: " + product.getName() + ", Price: " + product.getPrice())  // Map products to desired format
                .forEach(System.out::println);
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