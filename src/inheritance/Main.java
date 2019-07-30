package inheritance;

public class Main {

    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();

        duck.display();
        duck.swim();
        duck.fly();
        duck.quack();
//        duck.fly();

        RedHeadDuck redHeadDuck = new RedHeadDuck();

        redHeadDuck.display();
        redHeadDuck.swim();
       /* redHeadDuck.fly();
        redHeadDuck.quack();*/


        RubberDuck rubberDuck = new RubberDuck();

        rubberDuck.display();
        rubberDuck.swim();
//        rubberDuck.quack();

        WoodenDuck woodenDuck = new WoodenDuck();

        woodenDuck.display();
        woodenDuck.swim();




    }
}
