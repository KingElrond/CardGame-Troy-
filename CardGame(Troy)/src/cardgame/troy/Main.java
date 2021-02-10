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
int[] hand1Num, origh1, tempOrder;
hand1 = new String[5];
hand1Num = new int[5];
origh1 = new int[5];
tempOrder = new int[5];
        // TODO code application logic here
        DeckManager dm = new DeckManager();
        
        dm.shuffleInit();
        for(int i=0; i<5; i++)
        {
        hand1[i]=dm.drawCard();
        hand1Num[i]=Integer.valueOf(hand1[i].substring(1));
        origh1[i]=hand1Num[i];
        }
        SortArray sa = new SortArray(hand1Num);
        hand1Num=sa.sortIt();
        for(int i =0; i<5; i++)
        {
        	if(hand1Num[i]==origh1[i])
        	{
        		tempOrder[i]=i;
        	} else if(hand1Num[i]==origh1[0])
        	{
        		tempOrder[i]=0;
        	}else if(hand1Num[i]==origh1[1])
        	{
        		tempOrder[i]=1;
        	}else if(hand1Num[i]==origh1[2])
        	{
        		tempOrder[i]=2;
        	}else if(hand1Num[i]==origh1[3])
        	{
        		tempOrder[i]=3;
        	}else if(hand1Num[i]==origh1[4])
        	{
        		tempOrder[i]=4;
        	}
        }
        for(String card : hand1)
        {
        	System.out.println(card);
        }
        hand1=dm.switchArr(hand1, tempOrder);
        System.out.println("Sorted by number hand");
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
