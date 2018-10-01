public class Exercise13 {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an int
        currentHours = 24 - currentHours;
        currentMinutes = 60 - currentMinutes;
        currentSeconds = 60 - currentSeconds;
        //convert
        int convert = (currentHours*60*60) + (currentMinutes*60) + currentSeconds;
        System.out.println("Today number of remaining seconds is " + convert);
    }
}
