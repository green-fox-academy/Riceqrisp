import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals h
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many chickens do You have?");
        int userInput1 = scanner.nextInt();

        System.out.println("How many cows do You have?");
        int userInput2 = scanner.nextInt();

        System.out.println("Are there any cripples amongst them?");
        boolean userInput3 = scanner.nextBoolean();

        if (userInput3 == true) {
            System.out.println("Ohhhh man, please take care of them I am vegan. :( ");
        }
        else {
            int numberOfLegs = userInput1*4 + userInput2*4;
            System.out.println("All these animals have " + numberOfLegs + " legs, and please don't ask me on how many ways we can cook them");
        }

    }
}
