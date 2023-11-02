package de.jarai.state.solution2.states;

public class PickedUpState extends PhoneState {
    @Override
    public PhoneState dial() {
        return new ConnectedState();
    }
}
