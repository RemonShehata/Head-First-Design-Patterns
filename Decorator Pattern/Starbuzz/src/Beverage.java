public abstract class Beverage {
    String description = "Unknown Beverage";
    private Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double getCost();

    enum Size {
        tall,
        grande,
        venti
    }
}
