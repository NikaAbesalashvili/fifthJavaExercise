package ge.edu.btu;

public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public double sum(double x, double y) {
        return x + y;
    }

    @Override
    public double prod(double x, double y) {
        return x * y;
    }
}
