public class FibonacciF {
    int n;

    //    public static void main(String[] args) {
//        System.out.println(getFibonacci(9));
//    }
    public static int getFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            try {
                if (n == 0) {
                    System.out.println("For 0 there is no point dude... check more than zero.");
                }
                throw new Exception("your n is too high");
            } catch (Exception e){
                e.getMessage();
            }
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}


