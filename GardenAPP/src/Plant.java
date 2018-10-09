public class Plant extends Garden {
    String plantName;
    String plantColor;
    int plantThirst;
    public Plant(){
    countOfPlant++
    }
    public void wateringFlowers() {
        for (int i = 0; i <= countOfPlant; i++) {
            while (this.plantThirst < 5) {
                this.plantThirst++;
            }
        }
    }
}