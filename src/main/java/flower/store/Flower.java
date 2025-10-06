package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter
public final class Flower {

    @Getter
    private final double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private final FlowerType flowerType;

    public Flower(final double sepalLength, final FlowerColor color, final double price, final FlowerType flowerType) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }

    public Flower(final Flower flower) {
        this.sepalLength = flower.getSepalLength();
        this.color = FlowerColor.fromHex(flower.getColor());
        this.price = flower.getPrice();
        this.flowerType = flower.getFlowerType();
    }

    public String getColor() {
        return color.toString();
    }

    public static boolean compareFlowers(final Flower f1, final Flower f2) {
        return f1.getFlowerType() == f2.getFlowerType()
                && f1.getColor().equals(f2.getColor())
                && f1.getSepalLength() == f2.getSepalLength()
                && f1.getPrice() == f2.getPrice();
    }
}
