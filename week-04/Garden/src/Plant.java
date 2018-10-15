public abstract class Plant {
    String color;
    double waterAmount;
    boolean needwater;
    double tolerance;


    public Plant(String color, double tolerance){
        this.color = color;
        waterAmount = 0;
        this.tolerance = tolerance;
    }
    public void water(double watering){

        waterAmount += waterAmount + absorptionLevel();
    }
    public boolean needswater() {
        return waterAmount < tolerance;
    }
    public abstract double absorptionLevel();
}
