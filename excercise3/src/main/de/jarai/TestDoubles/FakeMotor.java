package de.jarai.TestDoubles;


/**
*     "Fake" Implementierung von IMotor (z.B. zum Debuggen)
*/
public class FakeMotor implements IMotor {
    public void Anlassen() {
        System.out.println("Motor anlassen");
    }

    public void Abstellen() {
        System.out.println("Motor abstellen");
    }
}