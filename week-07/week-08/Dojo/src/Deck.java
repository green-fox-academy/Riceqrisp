import java.util.*;
import java.util.logging.Handler;

public class Deck {
//    ArrayList<String> black = new ArrayList<> ();

    public int comparable(String card){
        int cardnumber = 0;
        cardnumber = Integer.parseInt(card.substring(0,1));

        return cardnumber;
    }

    public int thirdChar(String card2){
        int cardnumber = 0;
        cardnumber = Integer.parseInt(card2.substring(3,4));

        return cardnumber;
    }
    public int getBigger (String card3){
        if (comparable(card3)>thirdChar(card3)){
            return comparable(card3);
        }
        else return thirdChar(card3);
    }
    public List toPokerHand(String cards){

        List<String> hand = new ArrayList<String>(Arrays.asList(cards.split(" ")));
        return hand;
    }
    /*public boolean isFlush (ArrayList blackHand1, ArrayList whiteHand ){
        for (int i = 0; i < hand.size() ; i++) {
                if (){

                }
        }{ boolean isFlush = true;

        return isFlush;
    }*/
    public List getWhiteHand (String cards){
        return toPokerHand(cards.substring(7));
    }
    public List getBlackHand (String cards){
        return toPokerHand(cards.substring(29));
    }
    public List<String> replaceLettersWithNumbers (List<String> oneHand){
        List<String> toReturn = new ArrayList<>() ;
        for (int i = 0; i < oneHand.size(); i++) {
            if (oneHand.get(i).contains("J")){
                oneHand.set(i,oneHand.get(i).replace("J","11"));
            }
            else if (oneHand.get(i).contains("Q")) {
                    oneHand.set(i,oneHand.get(i).replace("Q","12"));
                }
            else if (oneHand.get(i).contains("K")) {
                oneHand.set(i,oneHand.get(i).replace("K","13"));
            }
            else if (oneHand.get(i).contains("A")) {
                oneHand.set(i,oneHand.get(i).replace("A","14"));
            }
        }
        return oneHand;
    }
//    public boolean isFlush(List<String> hand){
//        int count = 5;
//        for (int i = 0; i < hand.size() ; i++) {
//            if(hand.get(i).contains("H")) {
//                count++;
//            }
//        }
//    }

}
//        Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH
//        Black: 2H 4S 4C 2D 4H White: 2S 8S AS QS 3S
//        Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C KH
//        Black: 2H 3D 5S 9C KD White: 2D 3H 5C 9S KH