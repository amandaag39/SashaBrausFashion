package main.java.sashabrausfashion.accessories;


import main.java.sashabrausfashion.models.Product;
import main.java.sashabrausfashion.models.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

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
}
