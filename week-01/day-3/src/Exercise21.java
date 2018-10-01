import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        //
        // It should print: Quite cool party!
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number of girls");
        int userInput1 = scanner.nextInt();

        System.out.println("Input number of boys");
        int userInput2 = scanner.nextInt();

        int sum = userInput1 + userInput2;

        if (userInput1 == userInput2 && sum >= 20) {
            System.out.println("The party is excellent!");
        }
        else if (userInput1 != userInput2 && sum >= 20) {
            System.out.println("Quite cool party!");
        }
        else if (sum > 20) {
            System.out.println("Avarage party... meh");
        }
        else if (userInput1 < 1) {
              System.out.println("Sausage party!");
          }
    }
}
