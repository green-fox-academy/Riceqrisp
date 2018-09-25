public class reverse {

    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        reverse(reversed);

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.
        //System.out.println(reversed);

        }

    public static String reverse(String reverse){

        for (int i = reverse.length()-1; i >= 0; i--) {

           char result = reverse.charAt(i);
            System.out.print(result);

    }
        return reverse;
    }
}
