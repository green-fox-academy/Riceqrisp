import java.util.Scanner;

public class Exercise28rev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the number");
        int userInput1 = scanner.nextInt();
        String star = "*";

        for (int i = 0; i <= userInput1; i++){

            for (int j = 0; j <= i; j++) {

                System.out.print(star);
            }
            System.out.println();
        }
    }
}
