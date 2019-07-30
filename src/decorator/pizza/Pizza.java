package decorator.pizza;

public abstract class Pizza {

    String description = "pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
