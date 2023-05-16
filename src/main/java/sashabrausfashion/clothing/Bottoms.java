package sashabrausfashion.clothing;

import sashabrausfashion.accessories.Bags;
import sashabrausfashion.models.Product;
import sashabrausfashion.models.Review;

import java.util.*;
import java.util.function.Supplier;

public class Bottoms extends Product implements Collection<Bottoms> {
    private String bottomsType;
    private final List<Bottoms> bottomsList;

    public Bottoms(String name, double price, String size, String color, double weight, String description,  String bottomsType) {
        super(name, price, size, color, weight, description);
        this.bottomsType = bottomsType;
        bottomsList = new ArrayList<>();
    }

    public String getBottomsType() {
        return bottomsType;
    }
    public void setType(String bottomsType) {
        this.bottomsType = bottomsType;
    }


    // 4. Supplier
    @Override
    protected Supplier<Product> getProductSupplier() {
        return () -> new Bottoms("New Bottoms", 50.0, "Medium", "blue", 1.0, "Beautiful new trousers", "Business");
    }
    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + bottomsType + ".");

    }

    @Override
    public void removeReview(Review review) {
    }

    // Implementation of Collection interface
    @Override
    public int size() {
        return bottomsList.size();
    }

    @Override
    public boolean isEmpty() {
        return bottomsList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return bottomsList.contains(o);
    }

    @Override
    public Iterator<Bottoms> iterator() {
        return bottomsList.iterator();
    }

    @Override
    public Object[] toArray() {
        return bottomsList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return bottomsList.toArray(a);
    }

    @Override
    public boolean add(Bottoms bottoms) {
        return bottomsList.add(bottoms);
    }

    @Override
    public boolean remove(Object o) {
        return bottomsList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return new HashSet<>(bottomsList).containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Bottoms> c) {
        return bottomsList.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return bottomsList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return bottomsList.retainAll(c);
    }

    @Override
    public void clear() {
        bottomsList.clear();
    }

    //10: Collections Streaming
    @Override
    public List<Product> getProductList() {
        List<Product> streamBottomsList = new ArrayList<>();

        //instances of bags
        Bottoms bottoms1 = new Bottoms("Bottoms 1", 100.00, "Small", "Black", 1, "Description 1", "Type 1");
        Bottoms bottoms2 = new Bottoms("Bottoms 2", 150.00, "Medium", "Red", 1, "Description 2", "Type 2");
        Bottoms bottoms3 = new Bottoms("Bottoms 3", 200.0, "Large", "Blue", 1, "Description 3", "Type 3");

        streamBottomsList.add(bottoms1);
        streamBottomsList.add(bottoms2);
        streamBottomsList.add(bottoms3);

        return streamBottomsList;
    }
}

