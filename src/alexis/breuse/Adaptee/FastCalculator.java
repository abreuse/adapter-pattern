package alexis.breuse.Adaptee;

public class FastCalculator implements NewCalculator {

    @Override
    public double add(double n, double n2) {
        System.out.println("Calculating faster !");
        return n + n2;
    }
}
