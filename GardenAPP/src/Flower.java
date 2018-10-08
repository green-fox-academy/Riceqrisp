public class Flower extends Garden{
    String flowerColor;
    public Flower() {

        flowerName  = "Lotus";
        flowerColor = "black";
        plantThirst = 0;
    }

    public Flower (String flowerName,String flowerColor,int plantThirst){
        super(flowerName,flowerColor,plantThirst);

    }
}
