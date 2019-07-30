package decorator.pizza;

public class Chicken extends Pizza {

    public Chicken() {
        description="Chicken";
    }

    @Override
    public double cost() {
        return 20;
    }
}
