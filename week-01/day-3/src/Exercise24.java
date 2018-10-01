public class Exercise24 {
    public static void main(String[] args) {
        // Create a program that prints all the even numbers between 0 and 500
        int even = 0;
        for (int i = 0; i < 500; i++) {
            if (even % 2 == 0) {
                System.out.println(even);
            }
            even = even + 1;
        }
    }
}
