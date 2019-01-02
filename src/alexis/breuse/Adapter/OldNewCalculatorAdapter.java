package alexis.breuse.Adapter;

import alexis.breuse.Adaptee.NewCalculator;
import alexis.breuse.TargetInterface.OldCalculator;

public class OldNewCalculatorAdapter implements OldCalculator {

    private NewCalculator newCalculator;

    public OldNewCalculatorAdapter(NewCalculator newCalculator) {
        this.newCalculator = newCalculator;
    }

    @Override
    public double add(double n, double n2) {
        System.out.println("Adapting the old calculator with the new interface");
        return newCalculator.add(n, n2);
    }
}
