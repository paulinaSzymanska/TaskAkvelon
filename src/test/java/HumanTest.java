import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HumanTest {
    Human human = new Human("Jack", 1000);

    @Test
    void shouldIncreaseDrunkAmount() {
        human.drink(100);

        Assertions.assertEquals(1100, human.getDrunkAmountInMl());
    }

    @Test
    void shouldThrowExceptionWhenNegativeAmountProvided() {
        Exception thrown = assertThrows(
                IllegalArgumentException.class,
                () -> human.drink(-100),
                "Expected to throw IllegalArgumentException"
        );

        assertTrue(thrown.getMessage().contains("Amount can not be negative"));
    }
}