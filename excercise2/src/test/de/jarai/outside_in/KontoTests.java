package de.jarai.outside_in;

import org.junit.jupiter.api.Test;


public class KontoTests {
    @Test
    public void EinzahlenTest() {
        // Arrange
        var target = new Konto(new FakeKalenderService());

        // Act
        target.Einzahlen(100);
    }

    @Test
    public void AbhebenTest() {
        // Arrange
        var target = new Konto(new FakeKalenderService());

        // Act
        target.Abheben(50);
    }
}