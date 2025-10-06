package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public final class FlowerBucketTest {

    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;
    private static final int SEPAL_LENGTH = 10;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        final int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        final int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);

        final Flower flower = new Flower(SEPAL_LENGTH, FlowerColor.RED, price, FlowerType.ROSE);
        final FlowerPack flowerPack = new FlowerPack(flower, quantity);

        flowerBucket.addPack(flowerPack);

        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }
}
