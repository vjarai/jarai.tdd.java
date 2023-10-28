package ex03_TestDoubles;

/// <summary>
///     "Leere" Implementierung von IMotor (ignoriert alle Aktionen)
/// </summary>
public class StubbedMotor implements IMotor
{
    public void Anlassen()
    {
    }

    public void Abstellen()
    {
    }
}