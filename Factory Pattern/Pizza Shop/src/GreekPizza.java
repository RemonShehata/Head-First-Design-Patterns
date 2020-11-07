public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing GreekPizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking GreekPizza...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting GreekPizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing GreekPizza...");
    }
}
