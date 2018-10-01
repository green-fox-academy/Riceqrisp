import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the number");

        int userInput1 = scanner.nextInt();
        int i,j,k;

        int spacing = (userInput1 + 1) / 2;

        String star = "*";

        //if (userInput1 % 2 != 0) {
        for (i = 0; i < userInput1; i++) {

        }
            for(k=1; k <= 2*i-1; k++){
                System.out.println(star);
            }
            for (j = 0; j <= 2*userInput1 - 1; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
        //else if (userInput1 % 2 == 0)
       /* {
                System.out.println("Please use odd number");
        }
        */
    }



