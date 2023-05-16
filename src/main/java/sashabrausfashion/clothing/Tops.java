package sashabrausfashion.clothing;

import sashabrausfashion.accessories.Bags;
import sashabrausfashion.models.Product;
import sashabrausfashion.models.Review;

import java.util.*;
import java.util.function.Supplier;

public class Tops extends Product implements Collection<Tops> {
    private String topsType;
    private final List<Tops> topsList;

    public Tops(String name, double price, String size, String color, double weight, String description, String topsType) {
        super(name, price, size, color, weight, description);
        this.topsType = topsType;
        topsList = new ArrayList<>();
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

    // 4. Supplier
    @Override
    protected Supplier<Product> getProductSupplier() {
        return () -> new Tops("New Top", 50.0, "Medium", "blue", 1.0, "A beautiful new top", "T-Shirt");
    }
    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + topsType + ".");
    }

    @Override
    public void removeReview(Review review) {

    }

    // Implementation of Collection interface
    @Override
    public int size() {
        return topsList.size();
    }

    @Override
    public boolean isEmpty() {
        return topsList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return topsList.contains(o);
    }

    @Override
    public Iterator<Tops> iterator() {
        return topsList.iterator();
    }

    @Override
    public Object[] toArray() {
        return topsList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return topsList.toArray(a);
    }

    @Override
    public boolean add(Tops tops) {
        return topsList.add(tops);
    }

    @Override
    public boolean remove(Object o) {
        return topsList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return new HashSet<>(topsList).containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Tops> c) {
        return topsList.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return topsList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return topsList.retainAll(c);
    }

    @Override
    public void clear() {
        topsList.clear();
    }

    //10: Collections Streaming
    @Override
    public List<Product> getProductList() {
        List<Product> streamTopsList = new ArrayList<>();

        //instances of bags
        Tops top1 = new Tops("Top 1", 100.00, "Small", "Black", 1, "Description 1", "Type 1");
        Tops top2 = new Tops("Top 2", 150.00, "Medium", "Red", 1, "Description 2", "Type 2");
        Tops top3 = new Tops("Top 3", 200.0, "Large", "Blue", 1, "Description 3", "Type 3");

        streamTopsList.add(top1);
        streamTopsList.add(top2);
        streamTopsList.add(top3);

        return streamTopsList;
    }
}
