package sashabrausfashion.enums;

import java.util.ArrayList;

public enum OccasionType {
    WEDDING("Wedding"),
    WORK("Work"),
    CASUAL("Casual"),
    SPORTS("Sports"),
    FORMAL("Formal");

    private final String occasion;
    private ArrayList<String> availableClothingItems;

    OccasionType(String occasion) {
        this.occasion = occasion;
        availableClothingItems = new ArrayList<>();
    }

    public String getOccasion() {
        return occasion;
    }

    public void addClothingItem(String itemName) {
        availableClothingItems.add(itemName);
        System.out.println(itemName + " added to " + occasion + " occasion type.");
    }

    public ArrayList<String> getAvailableClothingItems() {
        return availableClothingItems;
    }

    public void printAvailableClothingItems() {
        System.out.println("Available clothing items for " + occasion + " occasion type:");
        for (String item : availableClothingItems) {
            System.out.println("- " + item);
        }
    }
}
