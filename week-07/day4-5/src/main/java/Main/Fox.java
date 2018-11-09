package Main;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    String name;
    ArrayList<String> listOfTricks = new ArrayList<>();

    public Fox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
