import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Copyfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        System.out.println("What is the name of the file you want to copy?");

        String userInput1 = scanner.nextLine();
        String pathname1 = userInput1;

        System.out.println("Where do you want to copy");
        String userInput2 = scanner.nextLine();
        String pathname2 = userInput2;


        try{
            Path pathfrom = Paths.get(pathname1);
            List<String> lines = Files.readAllLines(pathfrom);

            Path pathto = Paths.get(pathname2);
            List<String> content = lines;
            Files.write(pathto,content);

        }
        catch (IOException e){
            System.out.println(false);
        }
    }
}
