package ex03_TestDoubles;

public class Pkw
{
    public IMotor _motor;

    public Pkw(IMotor motor)
    {
        _motor = motor;
    }

    public double Tachostand ;

    public void Fahren(double strecke)
    {
        _motor.Anlassen();

        Tachostand += strecke;

        _motor.Abstellen();
    }
}