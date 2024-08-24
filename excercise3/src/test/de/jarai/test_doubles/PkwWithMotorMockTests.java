package de.jarai.test_doubles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PkwWithMotorMockTests {

    @Test
    public void Fahren_startet_Motor() {
        // Arrange
        var motorMock = new MotorMock();
        var target = new Pkw(motorMock);

        // Act
        target.Fahren(100);

        // Assert
        Assertions.assertTrue(motorMock.motorWurdeAngelassen);
    }

    @Test
    public void Fahren_stoppt_Motor() {
        // Arrange
        var motorMock = new MotorMock();
        var target = new Pkw(motorMock);

        // Act
        target.Fahren(100);

        // Assert
        Assertions.assertTrue(motorMock.motorWurdeAbgestellt);
    }


    @Test
    public void Fahren_erhoeht_Tachostand() {
        // Arrange
        var target = new Pkw(new MotorMock());

        // Act
        target.Fahren(100);

        // Assert
        Assertions.assertEquals(100, target._tachostand);
    }
}