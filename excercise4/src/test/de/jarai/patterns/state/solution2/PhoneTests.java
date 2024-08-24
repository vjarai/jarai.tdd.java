package de.jarai.patterns.state.solution2;

import de.jarai.patterns.state.solution2.exceptions.InvalidPhoneOperationException;
import de.jarai.patterns.state.solution2.states.ConnectedState;
import de.jarai.patterns.state.solution2.states.PickedUpState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneTests {

    @Test
    void givenNewPhone_canPickUp() {
        // given / arrange
        final var sut = new Phone();

        // when / act
        // then / assert
        assertDoesNotThrow(sut::pickUp);
    }

    @Test
    void givenPickedUpPhone_whenPickUp_thenThrowsInvalidPhoneOperationException() {
        // given / arrange
        final var sut = new Phone(new PickedUpState());

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
    void givenPickedUpPhone_canDial() {
        // given / arrange
        final var sut = new Phone( new PickedUpState());

        // when / act
        // then / assert
        assertDoesNotThrow(sut::dial);
    }

    @Test
    void givenNewPhone_whenHangUp_thenThrowsInvalidPhoneOperationException() {
        // given / arrange
        final var sut = new Phone();

        // when / act
        // then / assert
        assertThrows(InvalidPhoneOperationException.class, sut::hangUp);
    }

    @Test
    void givenConnectedPhone_canHangUp() {
        // given / arrange
        final var sut = new Phone( new ConnectedState());

        // when / act
        // then / assert
        assertDoesNotThrow(sut::hangUp);
    }

    @Test
    //@Disabled
    void givenPickedUpPhone_canHangUp() {
        // given / arrange
        final var sut = new Phone( new PickedUpState());

        // when / act
        // then / assert
        assertDoesNotThrow(sut::hangUp);
    }

}
