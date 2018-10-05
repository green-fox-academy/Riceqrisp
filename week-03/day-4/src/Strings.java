public class Strings {
    public static void main(String[] args) {
        System.out.println(LowerCaseXtoY("xxxxhaaakax"));
    }
    public static String LowerCaseXtoY(String string){

        if (string.length() == 0) {
            return string;
        }
        else if (string.charAt(0) == 'x') {
            return "x"+LowerCaseXtoY(string.substring(1));
        }
        else {

            return string.charAt(0) + LowerCaseXtoY(string.substring(1));

        }
    }
}
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.