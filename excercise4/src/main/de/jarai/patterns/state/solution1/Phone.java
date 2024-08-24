package de.jarai.patterns.state.solution1;


import de.jarai.patterns.state.solution1.exceptions.InvalidPhoneOperationException;

public class Phone {

    private enum State {
        HUNG_UP,
        PICKED_UP,
        CONNECTED
    }

    private State currentState = State.HUNG_UP;

    public void pickUp() {
        if (!currentState.equals(State.HUNG_UP)) {
            throw new InvalidPhoneOperationException();
        }
        this.currentState = State.PICKED_UP;
    }

    public void dial() {
        if (!State.PICKED_UP.equals(currentState)) {
            throw new InvalidPhoneOperationException();
        }
        this.currentState = State.CONNECTED;
    }

    public void hangUp() {
        if (!State.CONNECTED.equals(currentState)) {
            throw new InvalidPhoneOperationException();
        }
    }
}
