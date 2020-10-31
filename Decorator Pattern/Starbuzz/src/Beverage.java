public abstract class Beverage {
    String description;
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;
    float cost = 0f;

    public String getDescription() {
        return description;
    }

    public boolean hasMilk() {
        return milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    float getCost() {
        if (hasMilk()) {
            cost += 0.10;
        }

        if (hasSoy()) {
            cost += 0.20;
        }

        if (hasMocha()) {
            cost += 0.30;
        }

        if (hasWhip()) {
            cost += 0.40;
        }

        return cost;
    }
}
