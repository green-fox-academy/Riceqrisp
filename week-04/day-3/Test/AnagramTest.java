import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramTest {



    @Test
    public void legit() {
        Anagram pupa= new Anagram();

        assertEquals(false, pupa.sortString("kajak","kajak"));
    }
}