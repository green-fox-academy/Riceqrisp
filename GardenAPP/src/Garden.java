public class Garden {
    int countOfPlant;
    //String treeName;

    public Garden() {

    }
    public void wateringFlowers(){
        for (int i = 0; i <= countOfPlant; i++) {
            while(this.plantThirst < 5) {
               this.plantThirst++;
            }
        }
    }



}
