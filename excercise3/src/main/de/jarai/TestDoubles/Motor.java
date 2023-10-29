package de.jarai.TestDoubles;

public class Motor implements IMotor {
    public int Drehzahl;

    public void Anlassen() {
        Drehzahl = 1000;
    }

    public void Abstellen() {
        Drehzahl = 0;
    }
}