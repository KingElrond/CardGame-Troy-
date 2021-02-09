/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.troy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author troyd
 */
public class DeckManager {
public ArrayList<String> unshuffledDeck;
public ArrayList<Integer> ShuffledDeck = new ArrayList();
public ArrayList<Integer> calledCards = new ArrayList();
public DeckManager()
 {
        unshuffledDeck = new ArrayList<>(Arrays.asList("","Ace of Spades","10 of Spades","9 of Spades","8 of Spades","7 of Spades","6 of Spades","5 of Spades","4 of Spades","3 of Spades","2 of Spades","King of Spades","Queen of Spades","Jack of Spades",""
                + "Ace of Hearts","King of Hearts","Queen of Hearts","Jack of Hearts","10 of Hearts","9 of Hearts","8 of Hearts","7 of Hearts","6 of Hearts","5 of Hearts","4 of Hearts","3 of Hearts","2 of Hearts",""
                        + "Ace of Diamonds","Queen of Diamonds","King of Diamonds","Jack of Diamonds","10 of Diamonds","9 of Diamonds","8 of Diamonds","7 of Diamonds","6 of Diamonds","5 of Diamonds","4 of Diamonds","3 of Diamonds","2 of Diamonds",""
                                + "King of Clubs","jack of Clubs","queen of Clubs","10 of Clubs","9 of Clubs","8 of Clubs","7 of Clubs","6 of Clubs","5 of Clubs","4 of Clubs","3 of Clubs","2 of Clubs","Ace of Clubs"));
        
     
 }
public void shuffleInit()
{
    shuffleDeck();
}

private void shuffleDeck()
{
    boolean isrepeat=false;
    int randNum = (int) (Math.random() * (52 - 1)) + 1;;
    for(int i=0; i<unshuffledDeck.size(); i++)
    {
        isrepeat=true;
        while(isrepeat)
        {
            boolean stupidBool = false;
        randNum = (int) (Math.random() * (52 - 1)) + 1;
        for(int g : ShuffledDeck)
        {
            if(g==randNum)
            {
                isrepeat=true;
                stupidBool=true;
            }
            if(stupidBool==false)
            {
                isrepeat=false;
            }
        }
        }
    ShuffledDeck.add(randNum);
    }
    
}

public String drawCard()
{
    int cardtypenum=ShuffledDeck.get(1);
    ShuffledDeck.remove(1);
    String cardtoreturn = unshuffledDeck.get(cardtypenum);
  return cardtoreturn;
}
    
}
