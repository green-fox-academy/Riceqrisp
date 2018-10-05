public class sumdigit {
    public static void main(String[] args) {
        // Given a non-negative int n, return the sum of its digits recursively (no loops).
        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
        // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
        System.out.println(sumdigit(2068));
    }
    public static int sumdigit(int n) {
        if (n > 0 && n < 10){
            return n;
        }
        else {
            return (n % 10) + sumdigit(n/10);
        }
    }
}
