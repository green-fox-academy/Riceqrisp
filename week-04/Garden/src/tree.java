public class tree extends Plant{
    public tree(String color){
        super(color,10);
    }
    public void water(double watering){
        this.waterAmount =  watering * 0.40;
    }
    public boolean needswater() {
        return waterAmount < 10;
    }
}