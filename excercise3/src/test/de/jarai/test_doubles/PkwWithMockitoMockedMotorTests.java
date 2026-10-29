package de.jarai.test_doubles;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PkwWithMockitoMockedMotorTests {
    @Test
    public void Fahren_startet_Motor() {
        // Arrange
        var motorMock = Mockito.mock(IMotor.class); // Generate mocked motor

        var target = new Pkw(motorMock); // Inject mocked motor

        // Act
        target.Fahren(100);

        // Assert
        Mockito.verify(motorMock).Anlassen();
    }

    @Test
    public void Fahren_stoppt_Motor() {
        // Arrange
        var motorMock = Mockito.mock(IMotor.class);
        var target = new Pkw(motorMock);

        // Act
        target.Fahren(100);

        // Assert
        Mockito.verify(motorMock, Mockito.times(1)).Abstellen();
    }
}