import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the number");
        int userInput1 = scanner.nextInt();
        String star = "*";
        int a = userInput1;

        for (a = 1; a < userInput1; a++)
        {
            System.out.println(a+1);
            for (int i = a; i < userInput1; i++)
            {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
