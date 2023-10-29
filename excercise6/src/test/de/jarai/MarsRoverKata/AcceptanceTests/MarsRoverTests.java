package de.jarai.MarsRoverKata.AcceptanceTests;

import de.jarai.MarsRoverKata.Direction;
import de.jarai.MarsRoverKata.Grid;
import de.jarai.MarsRoverKata.MarsRover;
import de.jarai.MarsRoverKata.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTests
{
    @Test
    public void ExecuteCommands_M_should_0_1_N()
    {
        // Arrange
        var target = new MarsRover();

        // Act
        var actual = target.ExecuteCommands("M");

        // Assert

        Assertions.assertEquals("0:1:N", actual);
    }


    @Test
    public void ExecuteCommands_MMMMMMMMMM_should_0_0_N()
    {
        // Arrange
        var target = new MarsRover();

        // Act
        var actual = target.ExecuteCommands("MMMMMMMMMM");

        // Assert

        Assertions.assertEquals("0:0:N", actual);
    }

    @Test
    public void ExecuteCommands_MMRMMLM_should_2_3_N()
    {
        // Arrange
        var target = new MarsRover();

        // Act
        var actual = target.ExecuteCommands("MMRMMLM");

        // Assert

        Assertions.assertEquals("2:3:N", actual);
    }

    @Test
    public void ExecuteCommands_MMMM_with_Obstacle_0_3_should_O_0_2_N()
    {
        // Arrange
        var grid = new Grid();
        grid.AddObstacle(new Position(0, 3));

        var target = new MarsRover(grid, new Position(0, 0), Direction.North);

        // Act
        var actual = target.ExecuteCommands("MMMM");

        // Assert

        Assertions.assertEquals("O:0:2:N", actual);
    }
}