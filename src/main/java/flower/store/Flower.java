package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public static boolean compareFlowers(Flower f1, Flower f2) {
        return f1.getFlowerType() == f2.getFlowerType() &&
               f1.getColor().equals(f2.getColor()) &&
               f1.getSepalLength() == f2.getSepalLength() &&
               f1.getPrice() == f2.getPrice();
    }
}
