package de.jarai.state.solution1;

import de.jarai.state.solution1.exceptions.InvalidPhoneOperationException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneTests {

    @Test
    void givenNewPhone_whenPickUp_thenDoesntThrowAnException() {
        // given / arrange
        final var sut = new Phone(); // sut = subject under test

        // when / act
        // then / assert
        assertDoesNotThrow(sut::pickUp);
    }

    @Test
    void givenPhoneIsPickedUp_whenPickUp_thenThrowsInvalidPhoneOperationException() {
        // given / arrange
        final var sut = new Phone();
        sut.pickUp();

        // when / act
        // then / assert
        assertThrows(InvalidPhoneOperationException.class, sut::pickUp);
    }

    @Test
    void givenNewPhone_whenDial_thenThrowsInvalidPhoneOperationException() {
        // given / arrange
        final var sut = new Phone();

        // when / act
        // then / assert
        assertThrows(InvalidPhoneOperationException.class, sut::dial);
    }

    @Test
    void givenPhoneIsPickedUp_whenDial_thenDoesntThrowException() {
        // given / arrange
        final var sut = new Phone(); // sut = subject under test
        sut.pickUp();

        // when / act
        // then / assert
        assertDoesNotThrow(sut::dial);
    }

    @Test
    void givenNewPhone_whenHangUp_thenThrowsInvalidPhoneOperationException() {
        // given / arrange
        final var sut = new Phone(); // sut = subject under test

        // when / act
        // then / assert
        assertThrows(InvalidPhoneOperationException.class, sut::hangUp);
    }

    @Test
    void givenPhoneIsConnected_whenHangUp_thenDoesntThrowAnException() {
        // given / arrange
        final var sut = new Phone();
        sut.pickUp();
        sut.dial();

        // when / act
        // then / assert
        assertDoesNotThrow(sut::hangUp);
    }

    @Test
    @Disabled
    // at  this point we noticed, that the solution given by pure tdd and extremely dumb
    // kiss is too complex.
    void givenPhoneIsPickedUp_whenHangUp_thenDoesntThrowAnException() {
        // given / arrange
        final var sut = new Phone();
        sut.pickUp();

        // when / act
        // then / assert
        assertDoesNotThrow(sut::hangUp);
    }

}
