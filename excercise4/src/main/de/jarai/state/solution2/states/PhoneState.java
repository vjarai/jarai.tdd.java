package de.jarai.state.solution2.states;


import de.jarai.state.solution2.exceptions.InvalidPhoneOperationException;

public abstract class PhoneState {

    public PhoneState pickUp() {
        throw new InvalidPhoneOperationException();
    }

    public PhoneState dial() {
        throw new InvalidPhoneOperationException();
    }

    public PhoneState hangUp() {
        throw new InvalidPhoneOperationException();
    }

}
