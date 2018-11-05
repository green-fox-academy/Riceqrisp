import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.lines;

//Do I really need this array where is it used?
public class ListTasks {
    ArrayList<ToDos> storage = new ArrayList<>();

    public void writeToFile(String string){

        try {
            Path path = Paths.get("src/Storage");
            List<String> storage = Files.readAllLines(path);
            storage.add(string);
            Files.write(path, storage);
        } catch (Exception ex) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }
    public void readFromStorage(){
       Path path = Paths.get("src/Storage");
        try{

            List<String> storage = Files.readAllLines(path);

            for (int i = 0; i < storage.size(); i++) {

                String order = Integer.toString(i+1);
                if (storage.get(i).charAt(0) == '0') {
                    storage.set(i, order + ". " + "[" + " " + "]" + storage.get(i).substring(1));
                } else if (storage.get(i).charAt(0) == '1') {
                    storage.set(i, order + ". " + "[" + "x" + "]" + storage.get(i).substring(1));
                }
            }
                for (String element: storage) {
                    System.out.println(element);
                }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    public void completed(int index){
        Path path = Paths.get("src/Storage");
        try {
            List<String> storage = Files.readAllLines(path);
            for (int i = 0; i < storage.size(); i++) {
                if(i+1 == index) {
                    storage.set(i,storage.get(i).replace("0","1"));
                    Files.write(path,storage);
                }
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public String  easterEggBeard(String name) {
        if (name.length() > 0) {
            System.out.println();
            System.out.println(name + "'s" + " nothing else from now should be on to do list I think... Jack lost his compass");
        }
        return easterEggBeard(name + " doesn't have the parrot");
    }
    public void remove(int index){
        Path path = Paths.get("src/Storage");
        storage.remove(index);
        readFromStorage();
    }

}

