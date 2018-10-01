import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number a");
        int userInput1 = scanner.nextInt();

        if (userInput1 %2 == 0) {
            System.out.println("Your number is positive... and so do I");
        }
        else {
            System.out.println("This number is odd as F");
        }
    }
}
