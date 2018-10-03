import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

            // Create a function that takes 3 parameters: a path, a word and a number,
            // than it should write to a file.
            // The path parameter should be a string, that describes the location of the file.
            // The word parameter should be a string, that will be written to the file as lines
            // The number paramter should describe how many lines the file should have.
            // So if the word is "apple" and the number is 5, than it should write 5 lines
            // to the file and each line should be "apple"
            // The function should not raise any error if it could not write the file.

public class WriteMultipleLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the name of the file?");
        String userInput1 = scanner.nextLine();
        String pathname = userInput1;


        System.out.println("Which word you want to input?");
        String userInput2 = scanner.nextLine();
        String word = userInput2;

        System.out.println("How many times to print out?");
        int userInput3 = scanner.nextInt();
        int number = userInput3;

        List<String> content = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            content.add(word);
        }

        try {
            Path path = Paths.get(pathname);
            Files.write(path,content);

        } catch (Exception ex) {

        }

    }
}
