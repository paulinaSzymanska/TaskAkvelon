import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GlassTest {
    Glass glass = new Glass(500);

    @Test
    void shouldDecreaseByGivenAmount() {
        glass.decreaseAmount(100);

        Assertions.assertEquals(400, glass.getCurrentAmountInMl());
    }

    @Test
    void shouldThrowExceptionWhenNotEnoughLiquidInGlass() {
        Exception thrown = assertThrows(
                IllegalArgumentException.class,
                () -> glass.decreaseAmount(600),
                "Expected to throw IllegalArgumentException"
        );

        assertTrue(thrown.getMessage().contains("Not enough liquid"));
    }

     @Test
    void shouldThrowExceptionWhenNegativeAmountProvided() {
        Exception thrown = assertThrows(
                IllegalArgumentException.class,
                () -> glass.decreaseAmount(-100),
                "Expected to throw IllegalArgumentException"
        );

        assertTrue(thrown.getMessage().contains("Amount can not be negative"));
    }

}