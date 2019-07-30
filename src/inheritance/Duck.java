package inheritance;

public abstract class Duck {

     QuackableBehaviour quackableBehaviour;
     FlyBehaviour flyBehaviour;



    public void swim(){
        System.out.println("inheritance.Duck can swim");
    }

    /*removing fly and quack because all subclasses should not flay and qauck bad desing maintainaibility hard
    * manualy have to overide the function for changing behaviour*/
//    public void fly(){
//        System.out.println("inheritance.Duck can fly");
//    }
//
//    public void inheritance.Quack(){
//        System.out.println("inheritance.Duck Sound inheritance.Quack");
//    }

    public void display(){
        System.out.println("inheritance.Duck");
    }

    public void fly(){
        flyBehaviour.fly();
    }

    public void quack(){
        quackableBehaviour.quack();
    }
}
