import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramTest {
    String correctValue = "Applesefsefse";
    Apples apple = new Apples();


    @Test
    public void legit() {
        String returnedValue = apple.getApple();
        assertEquals("Apple is not equal to returnedValue check that",returnedValue, correctValue);
    }
}