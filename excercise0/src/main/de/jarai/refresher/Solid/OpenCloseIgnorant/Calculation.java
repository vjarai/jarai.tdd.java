package de.jarai.refresher.Solid.OpenCloseIgnorant;

public class Calculation {
    public double Calculate(IArithmeticOperation operation, double left, double right) {
        if (operation instanceof Addition) {
            return ((Addition) operation).Add(left, right);
        } else if (operation instanceof Subtraction) {
            return ((Subtraction) operation).Subtract(left, right);
        } else {

            throw new RuntimeException();
        }
    }
}