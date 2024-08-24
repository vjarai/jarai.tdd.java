package de.jarai.test_doubles;

public class Pkw {
    public IMotor _motor;
    public double _tachostand;

    public Pkw(IMotor motor) {
        _motor = motor;
    }

    public void Fahren(double strecke) {
        _motor.Anlassen();

        _tachostand += strecke;

        _motor.Abstellen();
    }
}