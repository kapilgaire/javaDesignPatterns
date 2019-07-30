package inheritance;

public class Quack implements QuackableBehaviour {
    @Override
    public void quack() {
        System.out.println("inheritance.Quack");
    }
}
