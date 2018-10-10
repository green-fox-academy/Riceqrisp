import java.util.Arrays;

public class Anagram {

    public static boolean sortString(String anagram, String word2){

            // convert input string to char array
            char anagramArray[] = anagram.toCharArray();
            char word2Array[] = word2.toCharArray();

            Arrays.sort(anagramArray);
            Arrays.sort(word2Array);

        if (Arrays.equals(word2Array,anagramArray)) return true;
        else return false;
        }

    public static void main(String[] args) {
        System.out.println(sortString("dupsko","okspud"));
    }
}
