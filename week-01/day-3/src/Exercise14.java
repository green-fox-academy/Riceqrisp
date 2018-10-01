import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("What's Your name Dude?");
        Scanner scanner = new Scanner(System.in);

        String userInput1 = scanner.nextLine();
        System.out.println("Hello " + userInput1);

        System.out.println("How old are You " + userInput1);
        int userInput2 = scanner.nextInt();

        System.out.println(userInput1 + ", dude " + userInput2 + " years, is still young");


    }
}
