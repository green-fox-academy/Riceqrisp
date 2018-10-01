public class Exercise27 {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.
            int i = 0;
            int check;

        for(i = 0; i<100; i++){
            check = i;
            System.out.println(i);

            if (check%5 == 0 && i % 3 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (check % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (check % 5 == 0)
            {
                System.out.println("Buzz");
            }

        }
    }
}
