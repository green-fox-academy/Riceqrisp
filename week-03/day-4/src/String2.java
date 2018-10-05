public class String2 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the 'x' chars have been removed.
        System.out.println(cutX("xxxxxxBamxxxx"));
    }
    public static String cutX(String string){
        if (string.length() == 0){
            return string;
        }
        else if (string.charAt(0) == 'x') {

            return " " + cutX(string.substring(1));
        }
        else {
            return string.charAt(0) + cutX(string.substring(1));
        }
    }

}



