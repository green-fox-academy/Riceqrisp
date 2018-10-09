import sun.awt.SunHints;

import java.util.Arrays;

public class Domino implements Comparable<Domino> {
     final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }
    @Override
    public int compareTo(Domino o) {

        return toString().compareTo(o.toString());
    }
}
//  You have the list of Dominoes
//  Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
//  eg: [2, 4], [4, 3], [3, 5] ...