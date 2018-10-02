import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;


public class workshop {
    public static void main(String[] args) throws IOException {
        Path myPath = Paths.get("types.txt");
        Files.write(myPath,"Boolean char".getBytes());

    }
}
