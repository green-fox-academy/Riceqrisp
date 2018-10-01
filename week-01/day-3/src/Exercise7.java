import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type Your name");
            String userInput1 = scanner.nextLine();

        System.out.println("Tell me your favorite number");
            int userInput2 = scanner.nextInt();

        System.out.println("Favourite number of " + userInput1 + " is " +userInput2);
        // Store your favorite number in a variable (as a number)
        // And print it like this: "My favorite number is: 8"
    }
}
