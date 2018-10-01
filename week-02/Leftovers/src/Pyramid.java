import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
       // System.out.println("Please input number of rows");

       // Scanner UserInput1 = new Scanner(System.in);


        for (int i = 0; i < 4 ; i++) {

            for (int k = 0; k < 4-i; k++) {

                System.out.print(" ");

            }

            for (int j = 0; j <= i*2 ; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
