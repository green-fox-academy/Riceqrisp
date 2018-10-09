import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {

        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        //dominoesordered.add(dominoes.get(j)
        List<Domino> dominosOrdered = new ArrayList<>();
//        dominosOrdered.add(dominoes.get(0));
//        boolean changad = true;
//        while (dominoes.size() > 0 && changad) {
//            changad = false;
//
//            for (int i = 0; i < dominoes.size(); i++) {
//
//                if (dominosOrdered.get(dominosOrdered.size() - 1).getValues()[1] == dominoes.get(i).getValues()[0]) {
//                    changad = true;
//                    dominosOrdered.add(dominoes.get(i));
//                   // dominoes.remove(i);
//                }
//
//            }
//        }
//        System.out.println(dominosOrdered);
        Collections.sort(dominoes);
        System.out.println(dominoes);
    }

    //dominoes.get(Domino.get
    static List<Domino> initializeDominoes() {

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

       return dominoes;

    }
}