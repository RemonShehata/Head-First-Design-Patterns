public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double getCost() {
        double cost = beverage.getCost();
        Beverage.Size size = beverage.getSize();
        if (size == Size.tall) {
            cost += 0.10;
        } else if (size == Size.grande) {
            cost += 0.15;
        } else if (size == Size.venti) {
            cost += 0.20;
        }

        return cost;
    }
}
