public class Exercise11 {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10
        a = a+10;

        System.out.println(a);


        int b = 100;
        // make it smaller by 7
        b -=7;

        System.out.println(b);



        int c = 44;
        // please double c's value
        c = c*2;

        System.out.println(c);




        int d = 125;
        // please divide by 5 d's value
        d = d/5;

        System.out.println(d);




        int e = 8;
        // please cube of e's value
        e = e*e*e;

        System.out.println(e);




        int f1 = 123;
        int f2 = 345;
        boolean compare = f1>f2;
        // tell if f1 is bigger than f2 (print as a boolean)
        System.out.println(compare);


        int g1 = 350;
        int g2 = 200;
        boolean compareDouble = g2*2>g1;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        System.out.println(compareDouble);



        int h = 135798745;
        int div11 = h%11;
        boolean has = (div11 == 0);
        // tell if it has 11 as a divisor (print as a boolean)

        System.out.println(has);


        int i1 = 10;
        int i2 = 3;
        int i3 = i2*i2*i2;
        int i4 = i2*i2;
        boolean higher = (i1>i3 && i1<i4);
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        System.out.println(higher);



        int j = 1521;
        int div1 = j%3;
        int div2 = j%5;
        boolean dividable = (div1 == 0 || div2 == 0);
        // tell if j is dividable by 3 or 5 (print as a boolean)




        String k = "Apple";
        int i = 0;
        //fill the k variable with its cotnent 4 times
        for (i = 0; i<4; i++){

            System.out.println(k);

        }
    }
}
