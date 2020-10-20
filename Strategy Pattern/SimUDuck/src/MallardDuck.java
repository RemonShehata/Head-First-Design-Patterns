public class MallardDuck extends Duck implements Quackable, Flyable {
    @Override
    void display() {
        System.out.println("displaying MallardDuck");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck is flying");
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck is qucking");
    }
}
