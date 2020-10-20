public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();

    }

    @Override
    void display() {
        System.out.println("displaying DecoyDuck");
    }
}
