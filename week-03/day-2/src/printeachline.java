import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class printeachline {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"
        CreateFile("my-file.txt");
    }

    public static void CreateFile(String name) {
        Scanner scanner = new Scanner(System.in);
        try {

            File file = new File(name);

            Scanner scanner1= new Scanner(file);
        }
        catch (IOException ex){
            System.out.println("Unable to read the file: "+ name);
        }
    }
}