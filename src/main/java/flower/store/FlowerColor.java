package flower.store;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF");
    private final String hex_color;

    FlowerColor(String hex_color) {
        this.hex_color = hex_color;
    }

    @Override
    public String toString() {
        return hex_color;
    }

    public static FlowerColor fromHex(String hex) {
        FlowerColor output;
        switch (hex.trim()) {
            case "#FF0000" -> output = RED;
            case "#0000FF" -> output = BLUE;
            default -> output = null;
        }
        return output;
    }
}
