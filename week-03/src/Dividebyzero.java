import java.io.IOException;
import java.util.Scanner;

public class Dividebyzero {
    public static void main(String[] args) throws IOException {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to divide 10 by ");
        int userInput1 = scanner.nextInt();

        int result = 0;
        int ten = 10;

        try{divisionoften(ten,result,userInput1);

         }

        catch (ArithmeticException e)
        {
            System.out.println("fail");
        }

    }
    public static void divisionoften (int ten,int result,int input){

            result = ten / input;
            System.out.println(result);
        }
}
