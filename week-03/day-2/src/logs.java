import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class logs {
    public static void main(String[] args) {

        getUniqeIps();

        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.

    }
    public static List<String> getUniqeIps(){
        List<String> uniqueIps = new ArrayList<>(); // on the right sight it should be always ArrayList<>

        //Path path = Paths.get("logs.txt") this solution is optional
        try{
           List<String> lines =  Files.readAllLines(Paths.get("logs.txt"));
           for (String line : lines){
               System.out.println(line.split("   ")[1]);
           }
           //List<String> lines = Files.readAllLines(path); this solution is optional

        }
        catch (IOException e){
            e.printStackTrace();
        }
        return uniqueIps;
    }
}
