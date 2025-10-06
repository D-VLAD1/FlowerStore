package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public final class FlowerTest {

    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int INITIAL_SEPAL_LENGTH = 15;
    private static final int INITIAL_PRICE = 20;

    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower(INITIAL_SEPAL_LENGTH, FlowerColor.BLUE, INITIAL_PRICE, FlowerType.TULIP);
    }

    @Test
    public void testPrice() {
        final int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        final FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }
}
