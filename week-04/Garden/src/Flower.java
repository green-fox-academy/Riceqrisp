public class Flower extends Plant {

    public Flower() {
        super(color, 5);
    }

    public Flower(String color) {
        super(color, 5);
    }

    @Override
    public void water(double watering) {
        this.waterAmount = watering * 0.75;
    }
}
