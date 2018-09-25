public class Matrix {
    public static void main(String[] args) {
        int [] matrix = {0,0,0,0};
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = 1;
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j]+ " ");
            }
            System.out.println();
            matrix[i] = 0;
            }

        }
    }

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output