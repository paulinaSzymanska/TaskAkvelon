import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat cat = new Cat("Felix", 1000);

    @Test
    void shouldIncreaseDrunkAmount() {
        cat.drink(100);

        Assertions.assertEquals(1100, cat.getDrunkAmountInMl());
    }

    @Test
    void shouldThrowExceptionWhenNegativeAmountProvided() {
        Exception thrown = assertThrows(
                IllegalArgumentException.class,
                () -> cat.drink(-100),
                "Expected to throw IllegalArgumentException"
        );

        assertTrue(thrown.getMessage().contains("Amount can not be negative"));
    }
}