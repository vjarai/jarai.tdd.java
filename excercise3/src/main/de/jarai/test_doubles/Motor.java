package de.jarai.test_doubles;

public class Motor implements IMotor {
    public int Drehzahl;

    public void Anlassen() {
        Drehzahl = 1000;
    }

    public void Abstellen() {
        Drehzahl = 0;
    }

    @Override
    public int getDrehzahl() {
        return Drehzahl;
    }
}