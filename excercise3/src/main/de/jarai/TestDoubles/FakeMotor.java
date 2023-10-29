package de.jarai.TestDoubles;


/// <summary>
///     "Fake" Implementierung von IMotor (z.B. zum Debuggen)
/// </summary>
public class FakeMotor implements IMotor {
    public void Anlassen() {
        System.out.println("Motor anlassen");
    }

    public void Abstellen() {
        System.out.println("Motor abstellen");
    }
}