package sashabrausfashion.enums;

public enum Season {
    SPRING("Spring"),
    SUMMER("Summer"),
    FALL("Fall"),
    WINTER("Winter");

    private final String displaySeasonName;

    Season(String displayName) {
        this.displaySeasonName = displayName;
    }
    public String getDisplayName() {
        return displaySeasonName;
    }
}
