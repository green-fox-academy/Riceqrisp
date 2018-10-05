public class Counter {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and counts down from n.
        counterWithRecursion(6);
        }
    public static int counterWithRecursion (int n){
        if (n == 1) {
            System.out.println(n);
            return 1;
        } else {
            System.out.println(n);
            return counterWithRecursion(n - 1);
        }
    }
}
