package flower.store;

public enum FlowerColor {
    RED("#FF0000"),
    BLUE("#0000FF");

    private final String hexColor;

    FlowerColor(final String hexColor) {
        this.hexColor = hexColor;
    }

    @Override
    public String toString() {
        return hexColor;
    }

    public static FlowerColor fromHex(final String hex) {
        FlowerColor output;
        switch (hex.trim()) {
            case "#FF0000" -> output = RED;
            case "#0000FF" -> output = BLUE;
            default -> output = null;
        }
        return output;
    }
}
