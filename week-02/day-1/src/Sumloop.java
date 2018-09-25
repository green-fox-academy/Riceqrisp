public class Sumloop {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }
    public static int sum(int j) {

        int s = 0;

        for (int i = 0; i <= j; i++) {
            s = s + i;
            System.out.println(s);
        }

        return s;
    }
}
// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
