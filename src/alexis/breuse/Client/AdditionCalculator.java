package alexis.breuse.Client;

import alexis.breuse.TargetInterface.OldCalculator;

public class AdditionCalculator{

    private OldCalculator calculator;

    public AdditionCalculator(OldCalculator calculator) {
        this.calculator = calculator;
    }

    public double calculate(double n, double n2) {
        return this.calculator.add(n, n2);
    }
}
