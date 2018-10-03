
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.nio.file.Files;
        import java.util.List;

        public class Countlines {
            public static void main(String[] args) {
                try { // Required by Files.readAllLines(filePath);
                    // Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
                    Path filePath = Paths.get("my-textfile.txt");

                    List<String> lines = Files.readAllLines(filePath);

                    System.out.println(lines.size()); // Prints the first line of the file
                } catch (Exception e) {
                    System.out.println(0);
                }
            }
        }