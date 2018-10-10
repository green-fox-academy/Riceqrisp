import java.util.ArrayList;
import java.util.List;

public class Sum {
//    int number;
//    int number1;
//    int number2;

    List<Integer> numbers = new ArrayList<>();

   public Sum() {

    }
    public void addToSum(int number,int number1,int number2){
        numbers.add(number);
        numbers.add(number1);
        numbers.add(number2);
    }
    public int summing(){
       int result = 0;
        for (int i = 0; i < numbers.size() ; i++) {

            result = numbers.get(i) + result;
        }
        return result;
    }
}