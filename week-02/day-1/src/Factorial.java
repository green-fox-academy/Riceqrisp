public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorio(9));
        //int[] factor = {1,2,3,4,5};
    }
    public static int factorio(int i) {

        int factor = 1;
        int k=0;
        for (int j = 1; j <= i; j++)
        {
            factor = factor*j;
            System.out.println(factor);
        }
        return k;

    }
}

// - Create a function called `factorio`
//   that returns it's input's factorial
// !5 = 1*2*3*4*5