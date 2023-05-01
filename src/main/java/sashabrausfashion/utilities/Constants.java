package main.java.sashabrausfashion.utilities;

public final class Constants {
    public static final String BRAND_NAME = "Sasha Braus";
    public static final int MAX_PRODUCT_NAME_LENGTH = 50;

    static {
        System.out.println("Constants class initialized");
    }

    private Constants() {
        throw new IllegalStateException("Constants class");
    }

    public static void printBrandName() {
        System.out.println("Brand Name: " + BRAND_NAME);

    }
}