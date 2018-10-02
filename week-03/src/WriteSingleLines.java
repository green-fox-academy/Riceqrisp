import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLines {
    public static void main(String[] args) {

        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        // public static void main(String[] args)

                List<String> content = new ArrayList();

                content.add("First line of my file");
                try {

                    Path filePath = Paths.get("my-textfile.txt");

                    Files.write(filePath, content);

                } catch (Exception ex) {
                    System.out.println("Uh-oh, could not write the file!");
                }
    }
}

