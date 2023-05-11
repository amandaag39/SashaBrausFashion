package sashabrausfashion.enums;

public enum ItemType {
    BAGS("Bags"),
    HATS("Hats"),
    JEWELRY("Jewelry"),
    BOTTOMS("Bottoms"),
    DRESSES("Dresses"),
    TOPS("Tops");

    private final String displayName;

    ItemType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
