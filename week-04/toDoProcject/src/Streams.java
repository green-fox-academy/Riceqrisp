import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

//        myList.stream().filter(x -> x >5)
//        .forEach(System.out::println);
//        numbers.stream().filter(number -> (number % 2 == 0))
//                .forEach(System.out::println);
//        numbers.stream().filter(number -> (number % 2 != 0)).forEach(System.out::println);
//        numbers.stream().map(n -> n * n).forEach(System.out::println);

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
        numbers2.stream().filter(n -> (n * n > 20)).forEach(System.out::println);
        String uppercase = "UppeR CaSE";

        ArrayList<String> uppercase1 = new ArrayList<>(Arrays.asList(U,p,));

        uppercase.stream()
    }
}
