import java.util.ArrayList;
import java.util.List;

public class Garden{
    List<Plant> plants;
    public Garden(){
        plants = new ArrayList<>();
    }
    public void Plant(Plant plant){
        plants.add(plant);
    }
    public void waterThirsty(int waterAmount) {
        int count = 0;
        for (Plant onPlantOfTheList : plants) {
            if(onPlantOfTheList.needswater()){
            count++;
            }
        }
        double amountPerThirsty = waterAmount/count;
    }

}

