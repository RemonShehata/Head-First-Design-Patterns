public class ChocolateBoiler {
    private static ChocolateBoiler instance = new ChocolateBoiler();
    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler getInstance() {
        return instance;
    }

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (empty) {
            empty = false;
            boiled = false;
            //fill the boiler
        }
    }

    public void drain() {
        if (!empty && boiled) {

        }
    }

    public void boil() {
        if (!empty & !boiled) {
            // bring the contents to be boiled
            boiled = true;
        }
    }
}
