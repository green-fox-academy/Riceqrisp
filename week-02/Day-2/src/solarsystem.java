import java.util.*;
public class solarsystem {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"

        putSaturn(planetList);
        System.out.println(putSaturn(planetList));
    }

    private static boolean putSaturn(ArrayList<String> planetList) {
       planetList.add(3,"Saturn");
    }
}
