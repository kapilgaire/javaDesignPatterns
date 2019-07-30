package decorator.pizza;

public class Margherita extends Pizza {
    public Margherita() {
        description= "margherita";
    }

    @Override
    public double cost() {
        return 40;
    }
}
