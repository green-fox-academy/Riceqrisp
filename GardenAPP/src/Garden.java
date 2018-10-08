public class Garden {
    int countOfPlant;
    //String treeName;

    public Garden() {

        countOfPlant++;
        this.plantThirst = 0;
    }
    public void wateringFlowers(){
        for (int i = 0; i <= countOfPlant; i++) {
            while(this.plantThirst < 5) {
               this.plantThirst++;
            }
        }
    }

    public void checkThirst(){
            if (plantThirst < 5){
                System.out.println("The "+ " " + flowerColor + " " + flowerName + "need water");
            }
            else {
                System.out.println("The " + " " + flowerColor + " " + flowerName + "Doesn't need water");
            }
    }

}
