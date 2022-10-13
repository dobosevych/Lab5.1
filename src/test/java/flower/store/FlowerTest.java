package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerTest {
    private Flower flower;
    private static final int MAX_PRICE = 100;
    private static final Random randomGenerator = new Random();

    @BeforeEach
    public void init() {
        /**
         * Init flower
         */
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        int price = randomGenerator.nextInt(MAX_PRICE);
        flower.setPrice(price);
        assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        assertEquals("#FF0000", flower.getColor());
    }
}
