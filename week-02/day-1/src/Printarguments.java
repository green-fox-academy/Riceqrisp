public class Printarguments {
    public static void main(String[] args) {
        printParams(4);
    }
    public static int printParams(int j){
        for (int i = 0; i < j; i++) {

            System.out.println("input, "+ i );
        }
    return j;
    }
}
// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")