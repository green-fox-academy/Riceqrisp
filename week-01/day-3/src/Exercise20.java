import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number a");
        int userInput1 = scanner.nextInt();

        System.out.println("Input number b");
        int userInput2 = scanner.nextInt();

        if (userInput1 > userInput2) {
            System.out.println("a is bigger than b");
        } else if (userInput1 < userInput2) {
            System.out.println("a is lower than b");
        }
    }
}
