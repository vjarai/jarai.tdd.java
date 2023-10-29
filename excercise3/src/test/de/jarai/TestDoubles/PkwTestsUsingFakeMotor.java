package de.jarai.TestDoubles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PkwTestsUsingFakeMotor {
    @Test
    public void Fahren_erhoeht_Tachostand() {
        // Arrange
        var target = new Pkw(new FakeMotor());

        // Act
        target.Fahren(100);

        // Assert
        Assertions.assertEquals(100, target.Tachostand);
    }
}