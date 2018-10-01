import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        //int surface = 2*(length*width + width*height + height*length);


        double length = 4;
        double width = 5;
        double height = 10;

        double surface = 2*(length*width + width*height + height*length);
        double volume = length*width*height;


        System.out.println("Surface area " + surface);
        System.out.println("Volume: " + volume);

    }
}
