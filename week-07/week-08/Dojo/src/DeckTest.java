import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class DeckTest {
    Deck one = new Deck();


    @Test
    public void Test1(){
        String convert= "2H 3D";
        assertEquals(one.comparable(convert),2);
    }

    @Test
    public void test2(){
        String convert2 = "2H 3D";
        assertEquals(one.comparable(convert2), 2);
    }
    @Test
    public void test3(){
        String convert3 = "2H 3D";
        assertEquals(one.thirdChar(convert3), 3);
    }

    @Test
    public void test4(){
        String convert2 = "2H 3D";
        assertEquals(one.getBigger(convert2), 3);
    }
    @Test
    public void test5(){
        String convert2 = "2H 3D";
        assertEquals(one.getBigger(convert2), 3);
    }
    @Test
    public void test6(){
        String convert3 = "2H 3D 5S 9C KD";
        assertEquals(one.toPokerHand(convert3), Arrays.asList("2H", "3D", "5S", "9C", "KD"));
        }

    @Test
    public void whiteHand(){
    String twoHands = "Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH";
    assertEquals(one.getWhiteHand(twoHands), Arrays.asList("2C", "3H", "4S", "8C", "AH"));
    }
    @Test
    public void BlackHand(){
        String twoHands = "Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH";
        assertEquals(one.getBlackHand(twoHands), Arrays.asList("2C", "3H", "4S", "8C", "AH"));
    }

    @Test
    public void replaceLettersWithNumbers (){
        String twoHands = "Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH";
        String blackHand1 = "Black: JH KD QS AC JD";
        assertEquals(one.replaceLettersWithNumbers(one.getWhiteHand(blackHand1)),
                Arrays.asList("11d","13D","12S","14C","11D"));
    }
    @Test
    public void highestCardOneHand(){
        String BlackHand1 = "Black: 2H 3D 5S 9C KD";
        assertEquals(one.getWhiteHand(BlackHand1), "KD");
    }
}



//        Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH
//        Black: 2H 4S 4C 2D 4H White: 2S 8S AS QS 3S
//        Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C KH
//        Black: 2H 3D 5S 9C KD White: 2D 3H 5C 9S KH
