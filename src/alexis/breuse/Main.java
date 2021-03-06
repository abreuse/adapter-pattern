package alexis.breuse;

import alexis.breuse.Adaptee.FastCalculator;
import alexis.breuse.Adaptee.NewCalculator;
import alexis.breuse.Adapter.OldNewCalculatorAdapter;
import alexis.breuse.Client.AdditionCalculator;
import alexis.breuse.TargetInterface.OldCalculator;
import alexis.breuse.TargetInterface.SlowCalculator;

public class Main {

    public static void main(String[] args) {
        //Using the old interface
	    AdditionCalculator additionCalculator = new AdditionCalculator(new SlowCalculator());
	    additionCalculator.calculate(1, 3);

	    //Using the new interface thanks to the adapter
        NewCalculator adaptee = new FastCalculator();
        OldNewCalculatorAdapter adapter = new OldNewCalculatorAdapter(adaptee);

        AdditionCalculator client = new AdditionCalculator(adapter);
        client.calculate(1, 3);

        //inline : la nouvelle interface est adaptée pour être compatible avec l'ancienne
        //grâce au polymorphisme des interfaces
        OldCalculator calculator = new OldNewCalculatorAdapter(new FastCalculator());
        calculator.add(1,4);
    }
}
