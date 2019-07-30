package decorator.pizza;

public class TestPizza {

    public static void main(String[] args) {
        Pizza pizza = new Chicken();


        System.out.println(pizza.getDescription() +" "+ pizza.cost());

        Pizza pizza1 = new Chicken();

        pizza1 = new CheeseBurst(pizza1);

        pizza1 = new CheeseBurst(pizza1);

        System.out.println(pizza1.getDescription() +" "+ pizza1.cost());

        Pizza pizza2 = new Margherita();

        pizza2 = new Mushroom(pizza2);
        pizza2 = new CheeseBurst(pizza2);

        System.out.println(pizza2.getDescription() +" "+ pizza2.cost());


    }
}
