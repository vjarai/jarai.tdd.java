package de.jarai.rover;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MarsRoverTests {

    @Test
    void given_new_MarsRover_when_M_returns_0_1_N() {
        // arrange
        final var sut = new MarsRover();

        // act
        final var actual = sut.executeCommands("M");

        // assert
        assertEquals("0:1:N", actual);
    }

    @MethodSource
    @ParameterizedTest
    void given_new_MarsRover_with_direction_when_L_rotates_left(
            Direction direction,
            String expected
    ) {
        // arrange
        final var sut = new MarsRover(direction);

        // act
        final var actual = sut.executeCommands("L");

        // assert
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> given_new_MarsRover_with_direction_when_L_rotates_left() {
        return Stream.of(
                arguments(NorthDirection.Instance, "0:0:W"),
                arguments(EastDirection.Instance, "0:0:N"),
                arguments(SouthDirection.Instance, "0:0:E"),
                arguments(WestDirection.Instance, "0:0:S")
        );
    }

    @MethodSource
    @ParameterizedTest
    void given_new_MarsRover_with_direction_when_R_rotates_right(
            Direction direction,
            String expected
    ) {
        // arrange
        final var sut = new MarsRover(direction);

        // act
        final var actual = sut.executeCommands("R");

        // assert
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> given_new_MarsRover_with_direction_when_R_rotates_right() {
        return Stream.of(
                arguments(NorthDirection.Instance, "0:0:E"),
                arguments(EastDirection.Instance, "0:0:S"),
                arguments(SouthDirection.Instance, "0:0:W"),
                arguments(WestDirection.Instance, "0:0:N")
        );
    }

    @Test
    void given_new_MarsRover_with_Obstacle_at_01_when_M_stops_before_obstacle() {
        // arrange
        final var grid = new ObstacleGrid();
        grid.addObstacle(new Position(0, 1));
        final var sut = new MarsRover(grid);

        // act
        final var actual = sut.executeCommands("M");

        // assert
        assertEquals("O:0:0:N", actual);
    }

}
