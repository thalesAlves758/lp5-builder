import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarBuilderTest {
    @Test
    void shouldThrowInvalidModelException() {
        try {
            CarBuilder carBuilder = new CarBuilder();
            Car car = carBuilder
                    .setManufacturer("Toyota")
                    .setFuelType("gasoline")
                    .setDoorsNumber(4)
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Model is invalid", e.getMessage());
        }
    }
}