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
String[] hand1, h1S;
int[] hand1Num, origh1, tempOrder;
hand1 = new String[5];
h1S = new String[5];
hand1Num = new int[5];
origh1 = new int[5];
tempOrder = new int[5];
        // TODO code application logic here
        DeckManager dm = new DeckManager();
        
        dm.shuffleInit();
        for(int i=0; i<5; i++)
        {
        	String h = dm.drawCard();
        hand1[i]=h;
        h1S[i]=h;
        hand1Num[i]=Integer.valueOf(hand1[i].substring(1));
        origh1[i]=Integer.valueOf(hand1[i].substring(1));
        }
        
        
        for(int g : hand1Num)
        {
        	System.out.print(g + ",");
        }
        System.out.println();
        for(int g : origh1)
        {
        	System.out.print(g + ",");
        }
        
        SortArray sa = new SortArray(hand1Num);
        hand1Num=sa.sortIt();
        
        for(int g : hand1Num)
        {
        	System.out.print(g + ",");
        }
        System.out.println();
        for(int g : origh1)
        {
        	System.out.print(g + ",");
        }
        System.out.println();
        
        h1S =dm.sortStr(h1S);
        for(int i =0; i<5; i++)
        {
        	if(hand1Num[i]==origh1[i] && !dm.containsInt(tempOrder, i))
        	{
        		tempOrder[i]=i;
        	} else if(hand1Num[i]==origh1[0] && !dm.containsInt(tempOrder, 0))
        	{
        		tempOrder[i]=0;
        	}else if(hand1Num[i]==origh1[1] && !dm.containsInt(tempOrder, 1))
        	{
        		tempOrder[i]=1;
        	}else if(hand1Num[i]==origh1[2] && !dm.containsInt(tempOrder, 2))
        	{
        		tempOrder[i]=2;
        	}else if(hand1Num[i]==origh1[3] && !dm.containsInt(tempOrder, 3))
        	{
        		tempOrder[i]=3;
        	}else if(hand1Num[i]==origh1[4] && !dm.containsInt(tempOrder, 4))
        	{
        		tempOrder[i]=4;
        	}
        }
        
        for(int g : hand1Num)
        {
        	System.out.print(g + ",");
        }
        System.out.println();
        for(int g : origh1)
        {
        	System.out.print(g + ",");
        }
        System.out.println();
        for(int g : tempOrder)
        {
        	System.out.print(g + ",");
        }
        System.out.println();
        
        for(String card : hand1)
        {
        	System.out.println(card);
        }
        System.out.println("Sorted by suite");
        for(String card : h1S)
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
