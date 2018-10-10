import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
    String correctValue = "Applesefsefse";
    Apples apple = new Apples();


    @Test
    public void ugiyt() {
        String returnedValue = apple.getApple();
        assertEquals("Apple is not equal to returnedValue check that",returnedValue, correctValue);
    }
}