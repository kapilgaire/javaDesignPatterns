package inheritance;

public class MallardDuck extends Duck  /*implements inheritance.Quackabke, inheritance.Flyable*/  {



    public MallardDuck() {

        flyBehaviour = new FlyWings();
        quackableBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard inheritance.Duck");
    }


  /*  @Override
    public void fly() {
        System.out.println("mallard inheritance.Duck Fly");

    }

    @Override
    public void quack() {
        System.out.println("mallard inheritance.Duck inheritance.Quack");

    }*/
}
