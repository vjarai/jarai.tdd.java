package org.example.rover;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DirectionTest {

    @ParameterizedTest
    @MethodSource
    void givenDirection_WhenGetNextPosition_ThenReturnNextPosition(
            Direction sut,
            Position expected
    ) {
        // arrange
        final var position = Position.START;

        // act
        final var actual = sut.getNextPosition(position);

        // assert
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> givenDirection_WhenGetNextPosition_ThenReturnNextPosition() {
        return Stream.of(
                arguments(Direction.NORTH, new Position(0, 1)),
                arguments(Direction.EAST, new Position(1, 0)),
                arguments(Direction.SOUTH, new Position(0, -1)),
                arguments(Direction.WEST, new Position(-1, 0))
        );
    }

}
