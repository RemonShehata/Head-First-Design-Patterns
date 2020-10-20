public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void swim() {
        System.out.println("Duck is swimming");
    }

    abstract void display();

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }
}
