package de.jarai.test_doubles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PkwWithMotorStubTests {
    @Test
    public void Fahren_erhoeht_Tachostand() {
        // Arrange
        var target = new Pkw(new MotorStub());

        // Act
        target.Fahren(100);

        // Assert
        Assertions.assertEquals(100, target._tachostand);
    }
}