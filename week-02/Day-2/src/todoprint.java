public class todoprint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //  - Diablo


        String mytodo = "My todo:\n";
        String todoText1 = " - Download games\n";
        String todoText2 = " - Diablo\n";

        System.out.println(mytodo+todoText+todoText1+todoText2);
    }
}
