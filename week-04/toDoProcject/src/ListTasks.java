import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.Files.lines;

//Do I really need this array where is it used?
public class ListTasks {
    //List<String> storage = new ArrayList<String>();


    //do I really need this method, I guess not.
    //    public void addToList(String task){
    //        storage.add(task); }

    public void writeToFile(String string){

        try {

            Path path = Paths.get("Storage");
            List<String> storage = Files.readAllLines(path);
            storage.add(string);

            Files.write(path, storage);

        } catch (Exception ex) {
            System.out.println("Uh-oh, could not write the file!");
        }
        //storage1.add("First line of my file");
    }
    public void readFromStorage(){
       Path path = Paths.get("Storage");
        try{

            List<String> storage = Files.readAllLines(path);
            String order = "";
            for (int i = 0; i < storage.size(); i++) {

               if (storage.get(i).charAt(0) == 0) {
                    order = storage.get(0).replace(storage.get(0).substring(0,1),i + "[" + "" + "]");
                }
                else if (storage.get(i).charAt(0) == 1) {
                    order = storage.get(0).replace(storage.get(0).substring(0,1),i + "[" + "x" + "]");
               }
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    public void completed(int index){
        Path path = Paths.get("Storage");
        try {
            List<String> storage = Files.readAllLines(path);
            // System.out.println(storage);
            // Following loop should work as:
            // for each check index if the index is one from args(given after -c) print out with number of index and concatanate it with [x]
            // else print out index + []

            for (int i = 0; i < storage.size(); i++) {

                if(index ==  i) {


                }
                else {
                    storage.set(i, "[" + " " + "]" + storage.get(i));
                }
            }
            Files.write(path,storage);
            System.out.println(storage);
            if (storage.size() == 0){
                System.out.println("There are no assigned todos");
            }
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
    public String  easterEggBeard(String name) {
        if (name.length() > 0) {
//            Path path = Paths.get("Storage");
            System.out.println();
            System.out.println(name + "'s" + " nothing else from now should be on to do list I think... Jack lost his compass");
            //List<String> storage = Files.readAllLines(path);
//            for (int i = 0; i < storage.size(); i++) {
//                storage.set(i, "[" + "x" + "]" + storage.get(i));
//            }
            // Files.(path,"C:/Documents/");
            // Files.exists()

        }
        return easterEggBeard(name + " doesn't have the parrot");
    }
    public void remove(int index){
        Path path = Paths.get("Storage");
        //.clear;

    }

}

