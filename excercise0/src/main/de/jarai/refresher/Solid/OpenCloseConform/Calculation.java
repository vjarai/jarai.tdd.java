package de.jarai.refresher.Solid.OpenCloseConform;

public class Calculation {
    public double Calculate(IArithmeticOperation op, double left, double right) {
        return op.Execute(left, right);
    }
}
