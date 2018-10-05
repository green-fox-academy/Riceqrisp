public class numberadder {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
        System.out.println(numberadder(9));
    }
    public static int numberadder(int n){
        if (n == 1){
            System.out.println(n);
            return 1;
        }
        else {
            System.out.println(n);
            return n+numberadder(n-1);

        }
    }
}
