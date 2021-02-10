/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.troy;

/**
 *
 * @author troyd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String[] hand1;
hand1 = new String[5];
        // TODO code application logic here
        DeckManager dm = new DeckManager();
        
        dm.shuffleInit();
        for(int i=0; i<5; i++)
        {
        hand1[i]=dm.drawCard();
        
        }
        for(String card : hand1)
        {
        	System.out.println(card);
        }
        /*
        System.out.println(dm.drawCard());
        System.out.println(dm.ShuffledDeck);
        for(int g: dm.ShuffledDeck)
        {
        	System.out.println(dm.unshuffledDeck.get(g));
        }
        */
    }
    
}
