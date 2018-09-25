public class Appenda {
    static String typo = "Chinchill";
    static String asd = "Dup";
    public static void main(String[] args) {
        System.out.println(appendAFunc(asd));
    }
    public static String appendAFunc(String input1){
        input1 = input1 + "a";
        return input1;
    }
}


//  Create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendAFunc` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
//
// - Print the result of `appendAFunc(typo)`