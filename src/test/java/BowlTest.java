import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlTest {

    Bowl bowl = new Bowl(500);

    @Test
    void shouldDecreaseByGivenAmount() {
        bowl.decreaseAmount(100);

        Assertions.assertEquals(400, bowl.getCurrentAmountInMl());
    }

    @Test
    void shouldThrowExceptionWhenNotEnoughLiquidInGlass() {
        Exception thrown = assertThrows(
                IllegalArgumentException.class,
                () -> bowl.decreaseAmount(600),
                "Expected to throw IllegalArgumentException"
        );

        assertTrue(thrown.getMessage().contains("Not enough liquid"));
    }

    @Test
    void shouldThrowExceptionWhenNegativeAmountProvided() {
        Exception thrown = assertThrows(
                IllegalArgumentException.class,
                () -> bowl.decreaseAmount(-100),
                "Expected to throw IllegalArgumentException"
        );

        assertTrue(thrown.getMessage().contains("Amount can not be negative"));
    }
}