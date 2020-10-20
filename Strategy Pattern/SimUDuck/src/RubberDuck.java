public class RubberDuck extends Duck implements Quackable {

    @Override
    void display() {
        System.out.println("displaying RubberDuck");
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck is squeaking");
    }
}
