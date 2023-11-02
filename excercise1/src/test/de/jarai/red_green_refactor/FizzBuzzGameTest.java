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
    public void GetResponse_when_1_then_1() {
        // Arrange
        var game = new FizzBuzzGame();

        // Act
        var actual = game.GetResponse(1);

        // Assert
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void GetResponse_when_3_then_Fizz() {
        // Arrange
        var game = new FizzBuzzGame();

        // Act
        var actual = game.GetResponse(3);

        // Assert
        Assertions.assertEquals("Fizz", actual);
    }

    @Test
    public void GetResponse_when_5_then_Buzz() {
        // Arrange
        var game = new FizzBuzzGame();

        // Act
        var actual = game.GetResponse(5);

        // Assert
        Assertions.assertEquals("Buzz", actual);
    }

    @Test
    public void GetResponse_when_15_then_FizzBuzz() {
        // Arrange
        var game = new FizzBuzzGame();

        // Act
        var actual = game.GetResponse(15);

        // Assert
        Assertions.assertEquals("FizzBuzz", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 101})
    public void GetResponse_when_less_then_1_or_bigger_then_100_throws_IllegalArgumentException(int input) {
        // Arrange
        var game = new FizzBuzzGame();

        // Act
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> game.GetResponse(input));
        //assertTrue(exception.getMessage().contains("test"));
    }

    /**
     * Parametrisierter Test: Deckt alle einfachem Testfälle in einem einzigen Test ab
     * @param input
     * @param expected
     */
    @ParameterizedTest
    @MethodSource("getInputDataForParameterizedTest")
    public void GetResponse(int input, Object expected) {
        // Arrange
        var game = new FizzBuzzGame();

        // Act
        var actual = game.GetResponse(input);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

}