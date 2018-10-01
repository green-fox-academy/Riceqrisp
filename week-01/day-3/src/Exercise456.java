public class Exercise456 {
    public static void main(String[] args) {
        // Ex 4 Write a program that prints a few details to the terminal window about you
        // It should print each detail to a new line.
        //  - Your name
        //  - Your age
        //  - Your height in meters (as a decimal fraction)
        //
        //  Example output:
        //  John Doe
        //  31
        //  1.87
       /* String name = "Tomek";
        int age = 29;
        double height = 1.8;

        System.out.println(name);
        System.out.println(age);
        System.out.println(height + " meters");

        // Ex 5 Create a program that prints a few operations on two numbers: 22 and 13

        // Print the reminder of 22 divided by 13
        int a = 22;
        int b = 13;
        double result = a/b;
        // Print the result of 13 added to 22
        System.out.println(a+b);

        // Print the result of 13 substracted from 22
        System.out.println(a-b);

        // Print the result of 22 multiplied by 13
        System.out.println(a*b);

        // Print the result of 22 divided by 13 (as a decimal fraction)
        System.out.println(a%b);

        //System.out.println(a/b);
        System.out.println(result);

        // Print the integer part of 22 divided by 13
        System.out.println(a/b);

        */

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int hours = 6;
        int hoursCodingWeekly = 6 * 5;
        int weeks = 17;
        int overallHours = 52*17;
        double percentage =  100*hoursCodingWeekly*17 / overallHours;
        System.out.println("In a semester attendee would program for " + hoursCodingWeekly*weeks + " hours");

        System.out.println("The percantage of working hours in the course " + percentage + "%");
    }
}
