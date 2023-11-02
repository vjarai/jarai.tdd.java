package de.jarai.state.solution2;


import de.jarai.state.solution2.states.HungUpState;
import de.jarai.state.solution2.states.PhoneState;

public class Phone {

    private PhoneState currentState = new HungUpState();

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
