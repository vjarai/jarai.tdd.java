package de.jarai.patterns.state.solution2.states;

public class PickedUpState extends PhoneState {
    @Override
    public PhoneState dial() {
        return new ConnectedState();
    }

    @Override public PhoneState hangUp(){
        return new HungUpState();
    }
}
