public class Factorio {
    public static void main(String[] args) {
        System.out.println(factorio(8));
    }
    public static int factorio (int n){
        if( n == 0 || n == 1 ) {
            return 1;
        }
        else {
            return n * factorio(n-1);
        }
    }

}
// Create a recursive function called `refactorio`
// that returns it's input's factorial