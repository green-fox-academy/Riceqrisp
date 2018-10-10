import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest {
    public static void main(String[] args) {

        Sum elements = new Sum();
        //elements.addToSum(1,2,3);
        System.out.println(elements.summing());

    }

   // int correctValue = 66;


    @Test
    public void legit() {
        Sum elements = new Sum();
        elements.addToSum(1,2,3);
        int returnedValue = elements.summing();
        assertEquals(6,returnedValue);
    }
}