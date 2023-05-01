package main.java.sashabrausfashion.clothing;

import main.java.sashabrausfashion.models.Product;
import main.java.sashabrausfashion.models.Review;

import java.util.*;

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

}
