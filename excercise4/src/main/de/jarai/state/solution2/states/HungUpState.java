package de.jarai.state.solution2.states;

public class HungUpState extends PhoneState {

    @Override
    public PhoneState pickUp() {
        return new PickedUpState();
    }

}
