package org.example.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObstacleGridTests {

    @Test
    void givenObstacleAt01_WhenHasObstacleAt01_ThenReturnsTrue() {
        // arrange
        final var sut = new ObstacleGrid();
        final var obstaclePosition = new Position(0, 1);
        sut.addObstacle(obstaclePosition);

        // act
        final var actual = sut.hasObstacleAt(obstaclePosition);

        // assert
        assertTrue(actual);
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
        assertFalse(actual);
    }

}
