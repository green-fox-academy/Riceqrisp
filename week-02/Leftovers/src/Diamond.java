public class Diamond {
    public static void main(String[] args) {

        for (int i = 0; i < 8 ; i++) {
            if(i >= 4) {
                for (int k = 0; k < 4 - i; k++) {

                    System.out.print(" ");

                }

                for (int j = 0; j <= i * 2; j++) {

                    System.out.print("*");
                }

                System.out.println();
            }
            else
             {
                 for (int l = 0; l < i + 1; l++) {

                     System.out.println(" ");
                 }
                 for (int m = 4; m > 0; m--) {

                     System.out.println("*");

                 }

                 System.out.println();

            }


        }
    }
}
