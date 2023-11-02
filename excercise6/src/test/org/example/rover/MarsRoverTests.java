package org.example.rover;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MarsRoverTests {

    @Test
    void givenMarsRoverAt00_WithMAsInput_ThenMovesOneFieldNorth() {
        // arrange
        final var sut = new MarsRover();

        // act
        final var actual = sut.move("M");

        // assert
        assertEquals("0:1:N", actual);
    }

    @MethodSource
    @ParameterizedTest
    void givenMarsRoverAt00_WithLAsInput_ThenTurnsLeft(
            Direction direction,
            String expected
    ) {
        // arrange
        final var sut = new MarsRover(direction);

        // act
        final var actual = sut.move("L");

        // assert
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> givenMarsRoverAt00_WithLAsInput_ThenTurnsLeft() {
        return Stream.of(
                arguments(Direction.NORTH, "0:0:W"),
                arguments(Direction.EAST, "0:0:N"),
                arguments(Direction.SOUTH, "0:0:E"),
                arguments(Direction.WEST, "0:0:S")
        );
    }

    @MethodSource
    @ParameterizedTest
    void givenMarsRoverAt00_WithRAsInput_ThenTurnsRight(
            Direction direction,
            String expected
    ) {
        // arrange
        final var sut = new MarsRover(direction);

        // act
        final var actual = sut.move("R");

        // assert
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> givenMarsRoverAt00_WithRAsInput_ThenTurnsRight() {
        return Stream.of(
                arguments(Direction.NORTH, "0:0:E"),
                arguments(Direction.EAST, "0:0:S"),
                arguments(Direction.SOUTH, "0:0:W"),
                arguments(Direction.WEST, "0:0:N")
        );
    }

    @Test
    void givenMarsRoverAt00_whenObstacleAt01AndMovesTo01_thenHoldsBeforeObstacle() {
        // arrange
        final var grid = new ObstacleGrid();
        grid.addObstacle(new Position(0, 1));
        final var sut = new MarsRover(grid);

        // act
        final var actual = sut.move("M");

        // assert
        assertEquals("O:0:0:N", actual);
    }

}
