package de.jarai.outside_in;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;


public class ApprovalTest {
    @Test
    public void KontoauszugTest() {
        // Arrange
        var target = new Konto(new FakeKalenderService());
        target.Einzahlen(100);
        target.Abheben(50);

        // Act
        String kontoauszug = target.ErstelleKontoauszug();

        // Assert
        Approvals.verify(kontoauszug);
    }
}