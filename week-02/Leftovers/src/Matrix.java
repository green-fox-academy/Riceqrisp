public class Matrix {
    public static void main(String[] args) {
        int [] matrix = {0,0,0,0};

        for (int j = 0; j < matrix.length ; j++) {

            matrix[j] = 1;

            for (int i = 0; i < matrix.length; i++) {

                System.out.print(matrix[i] + " ");

            }
            matrix[j] = 0;
            System.out.println();
        }
    }
}
