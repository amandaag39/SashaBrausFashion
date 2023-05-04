package sashabrausfashion.accessories;

import sashabrausfashion.models.Product;
import sashabrausfashion.models.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

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
}

