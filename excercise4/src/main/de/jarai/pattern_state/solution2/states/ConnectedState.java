package de.jarai.pattern_state.solution2.states;

public class ConnectedState extends PhoneState {

    @Override
    public PhoneState hangUp() {
        return new HungUpState();
    }
}
