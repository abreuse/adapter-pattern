package alexis.breuse.TargetInterface;

public class SlowCalculator implements OldCalculator {

    @Override
    public double add(double n, double n2) {
        System.out.println("Calculating slowly...");
        return n + n2;
    }
}
