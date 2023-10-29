package de.jarai.MarsRoverKata.UnitTests;

import de.jarai.MarsRoverKata.Grid;
import de.jarai.MarsRoverKata.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GridTests
{
    @Test
    public void HasObstacleTest()
    {
        // Arrange
        var target = new Grid();
        target.AddObstacle(new Position(0, 0));

        // Act
        var actual = target.HasObstacle(new Position(0, 0));

        // Assert
        Assertions.assertTrue(actual);
    }
}