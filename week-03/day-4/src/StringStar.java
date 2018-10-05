public class StringStar {
    public static void main(String[] args) {
        System.out.println(StringStar("xxxxhaaakax"));
    }
    public static String StringStar(String string){

        if (string.length() == 0) {
            return string;
        }
        else if (string.charAt(0) == 'x') {
            return "x" + StringStar(string.substring(1));
        }
        else {

            return string.charAt(0) + StringStar(string.substring(1));

        }
    }
}
// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".