package sashabrausfashion.clothing;

import sashabrausfashion.models.Product;
import sashabrausfashion.models.Review;

import java.util.*;
import java.util.function.*;

public class Dresses extends Product implements Collection<Dresses> {
    private String dressesType;
    private final List<Dresses> dressesList;

    public Dresses(String name, double price, String size, String color, double weight, String description, String dressesType) {
        super(name, price, size, color, weight, description);
        this.dressesType = dressesType;
        dressesList = new ArrayList<>();
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

    // Implementation of Collection interface
    @Override
    public int size() {
        return dressesList.size();
    }

    @Override
    public boolean isEmpty() {
        return dressesList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return dressesList.contains(o);
    }

    @Override
    public Iterator<Dresses> iterator() {
        return dressesList.iterator();
    }

    @Override
    public Object[] toArray() {
        return dressesList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return dressesList.toArray(a);
    }

    @Override
    public boolean add(Dresses dresses) {
        return dressesList.add(dresses);
    }

    @Override
    public boolean remove(Object o) {
        return dressesList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return new HashSet<>(dressesList).containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Dresses> c) {
        return dressesList.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return dressesList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return dressesList.retainAll(c);
    }

    @Override
    public void clear() {
        dressesList.clear();
    }


    //lambda Overrides

    //1. Predicate
    @Override
    public Predicate<Product> underOneHundred() {
        return p -> getPrice() < 100.0;
    }

    //2. Consumer
    @Override
    public Consumer<Product> printName() {
        return p -> System.out.println(p.getName());
    }

    //3. Function
    @Override
    public Function<Product,String> getDescriptionFunction() {
        return p -> "Dress description: " + p.getDescription();
    }

    // 4. Supplier
    @Override
    protected Supplier<Product> getProductSupplier() {
        return () -> new Dresses("New Dress", 50.0, "Medium", "blue", 1.0, "A beautiful new dress", "A-line");
    }

    // 5. UnaryOperator
    @Override
    public double applyTax(UnaryOperator<Double> taxOperator) {
        double priceWithTax = taxOperator.apply(price);
        return priceWithTax;
    }

}


