import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many kilometers you want to convert to miles?");

        double userInput1 = scanner.nextInt();

        userInput1 = userInput1 * 0.621371192;

        System.out.println("It makes " + userInput1 + " miles");

    }
}

