import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class ListTasks {
    List<String> storage = new ArrayList<String>();
    //Do I really need this array where is it used?

    public void addToList(String task){
        storage.add(task);
    } //do I really need this method if I read the file? I guess not.
    public void writeToFile(){

        List<String> storage1 = new ArrayList();
        try {

            Path filePath = Paths.get("Storage");

            Files.write(filePath, storage1);

        } catch (Exception ex) {
            System.out.println("Uh-oh, could not write the file!");
        }
        //storage1.add("First line of my file");
    }
    public void readFromStorage(){
       Path path = Paths.get("Storage");
        try{
            List<String> storage1 = Files.readAllLines(path);
            System.out.println(storage1);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    public void completed(){

    }
    public void remove(int index){
        storage.remove(index);
    }

}

