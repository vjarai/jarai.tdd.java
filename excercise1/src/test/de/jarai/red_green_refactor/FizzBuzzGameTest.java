package de.jarai.red_green_refactor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

// https://blog.jetbrains.com/idea/2020/09/writing-tests-with-junit-5/

class FizzBuzzGameTests {
    private static Stream<Arguments> getInputDataForParameterizedTest() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(3, "Fizz"),
                Arguments.of(5, "Buzz"),
                Arguments.of(15, "FizzBuzz")
        );
    }

    @Test
    public void givenNumberOne_whenGetResponse_thenReturnsOne() {
        // Arrange
        var game = new FizzBuzzGame();

        // Act
        var actual = game.GetResponse(1);

        // Assert
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void givenNumberDivisibleBy3_whenGetResponse_thenReturnsFizz() {
        // Arrange
        var game = new FizzBuzzGame();

        // Act
        var actual = game.GetResponse(3);

        // Assert
        Assertions.assertEquals("Fizz", actual);
    }

    @Test
    public void givenNumberDivisibleBy5_whenGetResponse_thenReturnsBuzz() {
        // Arrange
        var game = new FizzBuzzGame();

        // Act
        var actual = game.GetResponse(5);

        // Assert
        Assertions.assertEquals("Buzz", actual);
    }

    @Test
    public void givenNumberDivisibleBy3And5_whenGetResponse_thenReturnsFizzBuzz() {
        // Arrange
        var game = new FizzBuzzGame();

        // Act
        var actual = game.GetResponse(15);

        // Assert
        Assertions.assertEquals("FizzBuzz", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 101})
    public void givenNumberOutOfRange_whenGetResponse_thenThrowsIllegalArgumentException(int input) {
        // Arrange
        var game = new FizzBuzzGame();

        // Act
        Assertions.assertThrows(IllegalArgumentException.class, () -> game.GetResponse(input));
        //assertTrue(exception.getMessage().contains("test"));
    }

    /**
     * Parametrisierter Test: Deckt alle einfachen Testfälle in einem einzigen Test ab.
     *
     * @param input der Inputwert
     * @param expected das erwartete Ergebnis (Integer oder String)
     */
    @ParameterizedTest
    @MethodSource("getInputDataForParameterizedTest")
    public void givenVariousInputs_whenGetResponse_thenReturnsExpected(int input, Object expected) {
        // Arrange
        var game = new FizzBuzzGame();

        // Act
        var actual = game.GetResponse(input);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

}