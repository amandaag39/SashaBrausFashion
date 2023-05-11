package sashabrausfashion.enums;

public enum ClothingSize {
    SMALL("Small", 0),
    MEDIUM("Medium", 1),
    LARGE("Large", 2);

    private final String size;
    private final int index;

    ClothingSize(String size, int index) {
        this.size = size;
        this.index = index;
    }

    public String getSize() {
        return size;
    }

    public int getIndex() {
        return index;
    }

    public static ClothingSize getByIndex(int index) {
        for (ClothingSize size : ClothingSize.values()) {
            if (size.getIndex() == index) {
                return size;
            }
        }
        return null;
    }
}
