package sashabrausfashion.accessories;


import sashabrausfashion.clothing.Dresses;
import sashabrausfashion.models.Product;
import sashabrausfashion.models.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class Hats extends Product implements Collection<Hats> {
    private String hatsType;
    private final List<Hats> hatsList;

    public Hats (String name, double price, String size, String color, double weight, String description, String hatsType) {
        super(name, price, size, color, weight, description);
        this.hatsType = hatsType;
        hatsList = new ArrayList<>();
    }

    public String getHatsType() {
        return hatsType;
    }

    public void setHatsType(String hatsType) {
        this.hatsType = hatsType;
    }

    // 4. Supplier
    @Override
    protected Supplier<Product> getProductSupplier() {
        return () -> new Hats("Beret", 99.99, "Free", "Black", 0.5, "A classic, black beret","Beret");
    }
    @Override
    public void printDescription() {
        System.out.println("This is a " + color + " " + size + "size " + hatsType + "hat.");
    }

    @Override
    public void removeReview(Review review) {

    }

    // Collection interface methods
    @Override
    public int size() {
        return hatsList.size();
    }

    @Override
    public boolean isEmpty() {
        return hatsList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return hatsList.contains(o);
    }

    @Override
    public Iterator<Hats> iterator() {
        return hatsList.iterator();
    }

    @Override
    public Object[] toArray() {
        return hatsList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return hatsList.toArray(a);
    }

    @Override
    public boolean add(Hats hats) {
        return hatsList.add(hats);
    }

    @Override
    public boolean remove(Object o) {
        return hatsList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return hatsList.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Hats> c) {
        return hatsList.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return hatsList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return hatsList.retainAll(c);
    }

    @Override
    public void clear() {
        hatsList.clear();
    }


    //10: Collections Streaming
    @Override
    public List<Product> getProductList() {
        List<Product> streamHatsList = new ArrayList<>();

        //instances of bags
        Hats hat1 = new Hats("Hat 1", 100.00, "Free", "Black", 1,"Description 1", "Type 1");
        Hats hat2 = new Hats("Hat 2", 150.00, "Free", "Red", 1, "Description 2", "Type 2");
        Hats hat3 = new Hats("Hat 3", 200.0, "Free", "Blue", 1, "Description 3", "Type 3");

        streamHatsList.add(hat1);
        streamHatsList.add(hat2);
        streamHatsList.add(hat3);

        return streamHatsList;
    }
}
