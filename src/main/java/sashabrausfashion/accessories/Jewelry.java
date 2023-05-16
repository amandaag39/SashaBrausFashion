package sashabrausfashion.accessories;

import sashabrausfashion.clothing.Dresses;
import sashabrausfashion.models.Product;
import sashabrausfashion.models.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class Jewelry extends Product implements Collection<Jewelry> {
    private String jewelryType;
    private final List<Jewelry> jewelryList;

    public Jewelry (String name, double price, String size, String color, double weight, String description, String jewelryType) {
        super(name, price, size, color, weight, description);
        this.jewelryType = jewelryType;
        jewelryList = new ArrayList<>();
    }

    public String getJewelryType() {
        return jewelryType;
    }

    public void setJewelryType(String jewelryType){
        this.jewelryType = jewelryType;
    }

    // 4. Supplier
    @Override
    protected Supplier<Product> getProductSupplier() {
        return () -> new Jewelry("Ice Diamonds", 349.99, "Free", "Silver", 0.1, "A pair of diamond and silver formal earrings", "Earrings");
    }
    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + jewelryType + ".");
    }

    @Override
    public void removeReview(Review review) {

    }

    // Collection interface methods
    @Override
    public int size() {
        return jewelryList.size();
    }
    @Override
    public boolean isEmpty() {
        return jewelryList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return jewelryList.contains(o);
    }

    @Override
    public Iterator<Jewelry> iterator() {
        return jewelryList.iterator();
    }

    @Override
    public Object[] toArray() {
        return jewelryList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return jewelryList.toArray(a);
    }

    @Override
    public boolean add(Jewelry jewelry) {
        return jewelryList.add(jewelry);
    }

    @Override
    public boolean remove(Object o) {
        return jewelryList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return jewelryList.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Jewelry> c) {
        return jewelryList.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return jewelryList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return jewelryList.retainAll(c);
    }

    @Override
    public void clear() {
        jewelryList.clear();
    }


    //10: Collections Streaming
    @Override
    public List<Product> getProductList() {
        List<Product> streamJewelryList = new ArrayList<>();

        //instances of bags
        Jewelry jewelry1 = new Jewelry("Jewelry 1", 100.00, "Free", "Black", 1, "Description 1", "Type 1");
        Jewelry jewelry2 = new Jewelry("Jewelry 2", 150.00, "Free", "Red", 1, "Description 2", "Type 2");
        Jewelry jewelry3 = new Jewelry("Jewelry 3", 200.0, "Free", "Blue", 1, "Description 3", "Type 3");

        streamJewelryList.add(jewelry1);
        streamJewelryList.add(jewelry2);
        streamJewelryList.add(jewelry3);

        return streamJewelryList;
    }
}

