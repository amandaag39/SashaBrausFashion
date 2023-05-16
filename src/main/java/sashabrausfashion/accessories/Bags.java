package sashabrausfashion.accessories;

import sashabrausfashion.clothing.Dresses;
import sashabrausfashion.models.Product;
import sashabrausfashion.models.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Bags extends Product implements Collection<Bags> {
    private String bagsType;
    private List<Bags> bagsList;

    public Bags(String name, double price, String size, String color, double weight, String description, String bagsType) {
        super(name, price, size, color, weight, description);
        this.bagsType = bagsType;
        bagsList = new ArrayList<>();
    }

    public Bags() {
        super();
    }

    public String getBagsType() {
        return bagsType;
    }

    public void setType(String bagsType) {
        this.bagsType = bagsType;
    }

    // 4. Supplier
    @Override
    protected Supplier<Product> getProductSupplier() {
        return () -> new Bags("Camel Tote", 458.00, "Free", "Camel", 1, "A large, sturdy tote", "Tote");
    }
    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + bagsType + ".");
    }

    @Override
    public void removeReview(Review review) {

    }
    // Collection interface methods
    @Override
    public int size() {
        return bagsList.size();
    }
    @Override
    public boolean isEmpty() {
        return bagsList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return bagsList.contains(o);
    }

    @Override
    public Iterator<Bags> iterator() {
        return bagsList.iterator();
    }

    @Override
    public Object[] toArray() {
        return bagsList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return bagsList.toArray(a);
    }

    @Override
    public boolean add(Bags bags) {
        return bagsList.add(bags);
    }

    @Override
    public boolean remove(Object o) {
        return bagsList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return bagsList.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Bags> c) {
        return bagsList.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return bagsList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return bagsList.retainAll(c);
    }

    @Override
    public void clear() {
        bagsList.clear();
    }


    //10: Collections Streaming
    @Override
    public List<Product> getProductList() {
        List<Product> streamBagsList = new ArrayList<>();

        //instances of bags
        Bags bag1 = new Bags("Bag 1", 153.00, "Free", "Black", 1,"Description 1", "Type 1");
        Bags bag2 = new Bags("Bag 2", 151.00, "Free", "Red", 1, "Description 2", "Type 2");
        Bags bag3 = new Bags("Bag 3", 150.00, "Free", "Blue", 1, "Description 3", "Type 3");
        Bags bag4 = new Bags("Bag 4", 179.00, "Free", "Green", 1, "Description 4", "Type 4");
        Bags bag5 = new Bags("Bag 3", 150.00, "Free", "Blue", 1, "Description 3", "Type 3");

        streamBagsList.add(bag1);
        streamBagsList.add(bag2);
        streamBagsList.add(bag3);
        streamBagsList.add(bag5);
        streamBagsList.add(bag4);

        return streamBagsList;
    }


}