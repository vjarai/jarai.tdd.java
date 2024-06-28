package de.jarai.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptanceTests {



  @Test
  public void ExecuteCommands_M_should_0_1_N()
        {
            // Arrange
            var target = new MarsRover();

            // Act
            var actual = target.executeCommands("M");

            // Assert

            assertEquals("0:1:N", actual);
        }


    @Test
        public void ExecuteCommands_MMMMMMMMMM_should_0_0_N()
        {
            // Arrange
            var target = new MarsRover();

            // Act
            var actual = target.executeCommands("MMMMMMMMMM");

            // Assert
            assertEquals("0:0:N", actual);
        }

    @Test
        public void ExecuteCommands_MMRMMLM_should_2_3_N()
        {
            // Arrange
            var target = new MarsRover();

            // Act
            var actual = target.executeCommands("MMRMMLM");

            // Assert
            assertEquals("2:3:N", actual);
        }

    @Test
        public void ExecuteCommands_MMMM_with_Obstacle_0_3_should_O_0_2_N()
        {
            // Arrange
            var grid = new ObstacleGrid();
            grid.addObstacle(new Position(0, 3));

            var target = new MarsRover(grid);

            // Act
            var actual = target.executeCommands("MMMM");

            // Assert
            assertEquals("O:0:2:N", actual);
        }
    }


