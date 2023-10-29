package de.jarai.MarsRoverKata.UnitTests;

import de.jarai.MarsRoverKata.MarsRover;
import de.jarai.MarsRoverKata.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTest
{
    @Test
    public void CalculateNextPositionTest()
    {
        // Arrange
        var target = new MarsRover();

        // Act
        var actual = target.CalculateNextPosition();

        // Assert
        Assertions.assertEquals(new Position(0,1), actual);
    }
}