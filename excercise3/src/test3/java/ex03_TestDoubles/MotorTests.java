package ex03_TestDoubles;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorTests {
    @Test
    public void AnlassenTest() {
        // Arrange
        var target = new Motor();

        // Act
        target.Anlassen();

        // Assert
        Assertions.assertTrue(target.Drehzahl > 0);
    }

    @Test
    public void AbstellenTest() {
        // Arrange
        var target = new Motor();

        // Act
        target.Abstellen();

        // Assert
        Assertions.assertTrue(target.Drehzahl == 0);
    }
}