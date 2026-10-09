package de.jarai.patterns.state.solution2;

import de.jarai.patterns.state.solution2.exceptions.InvalidPhoneOperationException;
import de.jarai.patterns.state.solution2.states.ConnectedState;
import de.jarai.patterns.state.solution2.states.PickedUpState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PhoneTests {

    @Test
    void NewPhone_canPickUp() {

        final var sut = new Phone();

        assertDoesNotThrow(sut::pickUp);
    }

    @Test
    void PickedUpPhone_whenPickUp_throws_InvalidPhoneOperationException() {
        final var sut = new Phone(new PickedUpState());

        assertThrows(InvalidPhoneOperationException.class, sut::pickUp);
    }

    @Test
    void NewPhone_whenDial_throws_InvalidPhoneOperationException() {
        final var sut = new Phone();

        assertThrows(InvalidPhoneOperationException.class, sut::dial);
    }

    @Test
    void PickedUpPhone_canDial() {
        final var sut = new Phone( new PickedUpState());

        assertDoesNotThrow(sut::dial);
    }

    @Test
    void NewPhone_whenHangUp_throws_InvalidPhoneOperationException() {
        final var sut = new Phone();

        assertThrows(InvalidPhoneOperationException.class, sut::hangUp);
    }

    @Test
    void ConnectedPhone_canHangUp() {
        final var sut = new Phone( new ConnectedState());

        assertDoesNotThrow(sut::hangUp);
    }

    @Test
    //@Disabled
    void PickedUpPhone_canHangUp() {

        final var sut = new Phone( new PickedUpState());

        assertDoesNotThrow(sut::hangUp);
    }

}
