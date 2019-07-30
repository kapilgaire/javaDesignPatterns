package decorator.pizza;

public class CheeseBurst extends PizzaDecorator {

    Pizza pizza;

    public CheeseBurst(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " CheeseBurst";

    }

    @Override
    public double cost() {
        return pizza.cost() + 5;
    }
}
