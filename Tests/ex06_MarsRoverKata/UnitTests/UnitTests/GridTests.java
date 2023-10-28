package ex06_MarsRoverKata.UnitTests.UnitTests;

import ex06_MarsRoverKata.Grid;
import ex06_MarsRoverKata.Position;
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