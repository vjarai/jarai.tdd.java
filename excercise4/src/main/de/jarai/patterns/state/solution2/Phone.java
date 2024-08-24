package de.jarai.patterns.state.solution2;


import de.jarai.patterns.state.solution2.states.HungUpState;
import de.jarai.patterns.state.solution2.states.PhoneState;

public class Phone {

    private PhoneState currentState;

    public Phone() {
        currentState = new HungUpState();
    }

    public Phone(PhoneState currentState) {
        this.currentState = currentState;
    }

    public void pickUp() {

        currentState = currentState.pickUp();
    }

    public void dial() {

        currentState = currentState.dial();
    }

    public void hangUp() {
        currentState = currentState.hangUp();
    }
}
