import java.util.Scanner;

public class ParametricAvarag {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers?");
        int userInput1 = scanner.nextInt();

        int i = userInput1;
        int Summon = 0;
        int Avarage = 0;

        for (int j = 0; j < i; j++) {



            System.out.println("Please input integer " + i + " times");
            int userInput2  = scanner.nextInt();

            Summon = userInput2 + Summon;
            Avarage = Summon/i;


        }
        System.out.println("Avarage: " + Avarage);
        System.out.println("Sum: " + Summon);

    }
}
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4