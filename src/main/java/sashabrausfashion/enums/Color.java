package sashabrausfashion.enums;

public enum Color {
    BLACK("#000000"),
    WHITE("#FFFFFF"),
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF"),
    YELLOW("#FFFF00"),
    PURPLE("#800080"),
    PINK("#FFC0CB");

    private final String hexCode;

    Color(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }

    public static Color fromHexCode(String hexCode) {
        for(Color color : Color.values()) {
            if (color.hexCode.equalsIgnoreCase(hexCode)) {
                return color;
            }
        }
        return null;
    }
}
