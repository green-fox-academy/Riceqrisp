import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number a");
        int userInput1 = scanner.nextInt();

        System.out.println("Input number b");
        int userInput2 = scanner.nextInt();

        System.out.println("Input number c");
        int userInput3 = scanner.nextInt();

        System.out.println("Input number d");
        int userInput4 = scanner.nextInt();

        int sum = userInput1 + userInput2 + userInput3 + userInput4;
        int avg = sum/4;

        System.out.println("Sum: " + sum + " Avarage: " + avg);
    }
}
