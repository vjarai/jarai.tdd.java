package de.jarai.test_doubles;


/**
*     "Fake" Implementierung von IMotor zum Test der Motor Interaktion
*/
public class MotorMock implements IMotor {
    public boolean motorWurdeAngelassen;
    public boolean motorWurdeAbgestellt;

    public void Anlassen() {
        motorWurdeAngelassen = true;
    }

    public void Abstellen() {
        motorWurdeAbgestellt = true;
    }

    @Override
    public int getDrehzahl() {
        return 0;
    }
}