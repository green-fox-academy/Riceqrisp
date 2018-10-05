public class Bunnies {
    public static void main(String[] args) {
        System.out.println(earsNumber(4));
    }
    public static int earsNumber(int n) {
        if (n <= 0){
            return 0;
        }
        else   {
            System.out.println(n);
            return 2 + earsNumber(n-1);
        }
    }
}
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).