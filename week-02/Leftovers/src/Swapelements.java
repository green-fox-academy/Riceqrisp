public class Swapelements {
    public static void main(String[] args) {
        String [] abc = {"first","second","third",""};

        for (int i = 0; i <abc.length ; i++) {
            System.out.println(abc[i]);
        }


        abc[1] = abc[4];
        abc[1] = abc[3];
        abc[3] = abc[1];

        for (int i = 0; i <abc.length ; i++) {
            System.out.println(abc[i]);
        }
    }
}
