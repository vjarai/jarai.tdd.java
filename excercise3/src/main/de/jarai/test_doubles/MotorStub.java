package de.jarai.test_doubles;

/**
*     "Leere" Implementierung von IMotor (ignoriert alle Aktionen)
*/
public class MotorStub implements IMotor {
    public void Anlassen() {
    }

    public void Abstellen() {
    }

    @Override
    public int getDrehzahl() {
        return 0;
    }
}