public class RubberDuck extends Duck{

    @Override
    void display() {
        System.out.println("displaying RubberDuck");
    }

    @Override
    void quack() {
        System.out.println("Duck is squeaking");
    }

    @Override
    void fly() {
        // do nothing
    }
}
