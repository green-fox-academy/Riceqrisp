import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void legit() {
        FibonacciF pupa = new FibonacciF();
        assertEquals(0,pupa.getFibonacci(300));
    }
}