public class RedheadDuck extends Duck implements Quackable, Flyable {
    @Override
    void display() {
        System.out.println("displaying RedheadDuck");
    }

    @Override
    public void quack() {
        System.out.println("RedheadDuck is quacking");
    }

    @Override
    public void fly() {
        System.out.println("RedheadDuck is flying");
    }
}
