package de.jarai.rover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObstacleGridTests {

    @Test
    void givenObstacleAt01_WhenHasObstacleAt01_ThenReturnsTrue() {
        // arrange
        final var sut = new ObstacleGrid();
        final var obstaclePosition = new Position(0, 1);
        sut.addObstacle(obstaclePosition);

        // act
        final var actual = sut.hasObstacleAt(new Position(0,1));

        // assert
        Assertions.assertTrue(actual);
    }

    @Test
    void givenObstacleAt01_WhenHasObstacleAt02_ThenReturnsFalse() {
        // arrange
        final var sut = new ObstacleGrid();
        final var obstaclePosition = new Position(0, 1);
        sut.addObstacle(obstaclePosition);

        // act
        final var checkedPosition = new Position(0, 2);
        final var actual = sut.hasObstacleAt(checkedPosition);

        // assert
        Assertions.assertFalse(actual);
    }

}
