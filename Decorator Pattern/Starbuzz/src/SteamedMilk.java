public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", SteamedMilk";
    }

    @Override
    public double getCost() {
        return 0.10 + beverage.getCost();
    }
}
