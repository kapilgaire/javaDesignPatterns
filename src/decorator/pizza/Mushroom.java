package decorator.pizza;

public class Mushroom extends PizzaDecorator {

    Pizza pizza;

    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Mushroom";
    }

    @Override
    public double cost() {
        return pizza.cost() + 10;
    }
}
