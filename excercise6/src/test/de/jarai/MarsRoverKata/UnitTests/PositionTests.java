package de.jarai.MarsRoverKata.UnitTests;

import de.jarai.MarsRoverKata.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositionTests
{
    @Test
    public void EqualsTest()
    {
        // Arrange
        var pos1 = new Position(1, 2);
        var pos2 = new Position(1, 2);

        // Act
        var actual = pos1.equals(pos2);

        // Assert
        Assertions.assertTrue(actual);
    }

    @Test
    public void OperatorPlusTest()
    {
        // Arrange
        var pos1 = new Position(1, 2);
        var pos2 = new Position(3, 4);

        // Act
        var actual = pos1.Add(  pos2);

        // Assert
        Assertions.assertEquals(new Position(4, 6), actual);
    }

    @Test
    public void OperatorPlusTest_overflow()
    {
        // Arrange
        var pos1 = new Position(1, 0);
        var pos2 = new Position(3, 10);

        // Act
        var actual = pos1.Add( pos2);

        // Assert
        Assertions.assertEquals(new Position(4, 0), actual);
    }
}