public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        // do nothing - can’t quack!
        System.out.println("<< Silence >>");
    }
}
