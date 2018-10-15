import javax.sound.midi.Soundbank;

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
    public String needWaterMessage(){
        if (needswater() == false) {
            return " doesn't need water ";
        }
        else {
            return " needs water ";
        }
    }
    public abstract double absorptionLevel();
}
