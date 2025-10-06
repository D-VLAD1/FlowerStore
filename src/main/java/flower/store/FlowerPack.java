package flower.store;

import lombok.Getter;

@Getter
public class FlowerPack {
    private final Flower flower;
    private final int quantity;

    public FlowerPack(final Flower flower, final int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
