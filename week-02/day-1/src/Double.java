public class Double {
    static int baseNum = 123;
    public static void main(String[] args)
    {
        Double1(2);
    }
    public static void Double1(int multi)
    {
      System.out.println(multi * baseNum);
    }
}
// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)