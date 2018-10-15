public class Flower extends Plant {

    public Flower (String color) {
        super(color, 5);
    }

    @Override
    public double absorptionLevel(){
        return 0.75;
    }
}
