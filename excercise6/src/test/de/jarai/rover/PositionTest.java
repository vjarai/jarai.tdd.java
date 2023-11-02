package de.jarai.rover;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PositionTest {

    @ParameterizedTest
    @CsvSource({
            "0,1,      0,1,      0,2",
            "10,5,     2,3,      12,8",
            "123,456,  -1,-2,    122,454",
            "23,24,    -102,-25, -79,-1"})
    void givenStartPosition_whenAddPosition_ThenReturnNewPosition(
            int stepsEast1, int stepsNorth1,
            int stepsEast2, int stepsNorth2,
            int stepsEastExpected, int stepsNorthExpected
    ) {
        // arrange
        final var sut = new Position(stepsEast1, stepsNorth1);
        final var expected = new Position(stepsEastExpected, stepsNorthExpected);

        // act
        final var actual = sut.add(new Position(stepsEast2, stepsNorth2));

        // assert
        assertEquals(expected, actual);
    }

}