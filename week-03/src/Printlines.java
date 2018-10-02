import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class Printlines {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"

        //Scanner scanner = new Scanner(System.in);
        File file = new File("my-textfile.txt");

        try{
            Scanner scanner1 = new Scanner(file);
            while(scanner1.hasNext());
            {
                System.out.println(scanner1.nextLine());
            }
        }
        catch (IOException ex) {
            System.out.println("Unable to read file: my-textfile.txt");
        }

    }
}