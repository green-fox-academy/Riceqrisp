import org.junit.Test;

import static org.junit.Assert.*;

public class ToDosTest {
    @Test
    public void test1(){
        ToDos one = new ToDos();
        one.add("one task");
        one.add("second task");
        one.add("third task");
        assertEquals("1somethin",one.toLines());
    }

}