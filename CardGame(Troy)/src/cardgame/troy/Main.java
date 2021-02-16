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
    	boolean flushexist = false;
    	while(flushexist)
    	{
String[] hand1, h1S, p2hand, p3hand, p4hand, h2S, h3S,h4S,h1d,h2d,h3d,h4d;
int[] hand1Num, origh1, tempOrder, origh2, origh3, hand2Num, hand3Num, hand4Num, origh4;
boolean isf1,isf2,isf3,isf4;
hand1 = new String[5];
p2hand = new String[5];
p3hand = new String[5];
p4hand = new String[5];
h1S = new String[5];
h2S = new String[5];
h3S = new String[5];
h4S = new String[5];
h1d = new String[5];
h2d = new String[5];
h3d = new String[5];
h4d = new String[5];
hand1Num = new int[5];
hand2Num = new int[5];
hand3Num = new int[5];
hand4Num = new int[5];
origh1 = new int[5];
origh2 = new int[5];
origh3 = new int[5];
origh4 = new int[5];
tempOrder = new int[5];
        // TODO code application logic here
        DeckManager dm = new DeckManager();
        EvaluateHand eh = new EvaluateHand();
        
        
        dm.shuffleInit();
        for(int i=0; i<5; i++)
        {
        String h = dm.drawCard();
        hand1[i]=h;
        h1S[i]=h;
        hand1Num[i]=Integer.valueOf(hand1[i].substring(1));
        origh1[i]=Integer.valueOf(hand1[i].substring(1));
        
        
        h = dm.drawCard();
        p2hand[i]=h;
        h2S[i]=h;
        hand2Num[i]=Integer.valueOf(p2hand[i].substring(1));
        origh2[i]=Integer.valueOf(p2hand[i].substring(1));
        
        
        h = dm.drawCard();
        p3hand[i]=h;
        h3S[i]=h;
        hand3Num[i]=Integer.valueOf(p3hand[i].substring(1));
        origh3[i]=Integer.valueOf(p3hand[i].substring(1));
        
        
        h = dm.drawCard();
        p4hand[i]=h;
        h4S[i]=h;
        hand4Num[i]=Integer.valueOf(p4hand[i].substring(1));
        origh4[i]=Integer.valueOf(p4hand[i].substring(1));

        
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
        
        SortArray sa = new SortArray(hand1Num);
        hand1Num=sa.sortIt();
        
        SortArray saa = new SortArray(hand2Num);
        hand2Num=saa.sortIt();
        
        SortArray saaaa = new SortArray(hand3Num);
        hand3Num=saaaa.sortIt();
        
        SortArray saaaaa = new SortArray(hand4Num);
        hand4Num=saaaaa.sortIt();
        
        
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
        h2S =dm.sortStr(h2S);
        h3S =dm.sortStr(h3S);
        h4S =dm.sortStr(h4S);
        
        
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
        System.out.println("\n\nOriginal Hand");
        for(String card : hand1)
        {
        	System.out.print(card + ",");
        }
        System.out.println("\n\nSorted by suit");
        for(String card : h1S)
        {
        	System.out.print(card + ",");
        }
        hand1=dm.switchArr(hand1, tempOrder);
        System.out.println("\n\nSorted by number hand");
        for(String card : hand1)
        {
        	System.out.print(card + ",");
        }
        
        for(int i=0; i<5; i++)
        {
        	h1d[i]=h1S[i].substring(0,1);
        	h2d[i]=h2S[i].substring(0,1);
        	h3d[i]=h3S[i].substring(0,1);
        	h4d[i]=h4S[i].substring(0,1);
        }
        
        eh.checkFlush(h1d);
        isf1=eh.returnflush();
        eh.checkFlush(h2d);
        isf2=eh.returnflush();
        eh.checkFlush(h3d);
        isf3=eh.returnflush();
        eh.checkFlush(h4d);
        isf4=eh.returnflush();
        
        System.out.println();
        tempOrder = new int[5];
        for(int i =0; i<5; i++)
        {
        	if(hand2Num[i]==origh2[i] && !dm.containsInt(tempOrder, i))
        	{
        		tempOrder[i]=i;
        	} else if(hand2Num[i]==origh2[0] && !dm.containsInt(tempOrder, 0))
        	{
        		tempOrder[i]=0;
        	}else if(hand2Num[i]==origh2[1] && !dm.containsInt(tempOrder, 1))
        	{
        		tempOrder[i]=1;
        	}else if(hand2Num[i]==origh2[2] && !dm.containsInt(tempOrder, 2))
        	{
        		tempOrder[i]=2;
        	}else if(hand2Num[i]==origh2[3] && !dm.containsInt(tempOrder, 3))
        	{
        		tempOrder[i]=3;
        	}else if(hand2Num[i]==origh2[4] && !dm.containsInt(tempOrder, 4))
        	{
        		tempOrder[i]=4;
        	}
        }
        
        System.out.println("\n\n\nPlayer 2 Original Hand");
        for(String card : p2hand)
        {
        	System.out.print(card + ",");
        }
        System.out.println("\n\nSorted by suit");
        for(String card : h2S)
        {
        	System.out.print(card + ",");
        }
        p2hand=dm.switchArr(p2hand, tempOrder);
        System.out.println("\n\nSorted by number");
        for(String card : p2hand)
        {
        	System.out.print(card + ",");
        }
        
        
        tempOrder = new int[5];
        for(int i =0; i<5; i++)
        {
        	if(hand3Num[i]==origh3[i] && !dm.containsInt(tempOrder, i))
        	{
        		tempOrder[i]=i;
        	} else if(hand3Num[i]==origh3[0] && !dm.containsInt(tempOrder, 0))
        	{
        		tempOrder[i]=0;
        	}else if(hand3Num[i]==origh3[1] && !dm.containsInt(tempOrder, 1))
        	{
        		tempOrder[i]=1;
        	}else if(hand3Num[i]==origh3[2] && !dm.containsInt(tempOrder, 2))
        	{
        		tempOrder[i]=2;
        	}else if(hand3Num[i]==origh3[3] && !dm.containsInt(tempOrder, 3))
        	{
        		tempOrder[i]=3;
        	}else if(hand3Num[i]==origh3[4] && !dm.containsInt(tempOrder, 4))
        	{
        		tempOrder[i]=4;
        	}
        }
        
        System.out.println("\n\n\nPlayer 3 Original Hand");
        for(String card : p3hand)
        {
        	System.out.print(card + ",");
        }
        System.out.println("\n\nSorted by suit");
        for(String card : h3S)
        {
        	System.out.print(card + ",");
        }
        p3hand=dm.switchArr(p3hand, tempOrder);
        System.out.println("\n\nSorted by number");
        for(String card : p3hand)
        {
        	System.out.print(card + ",");
        }
        
        
        tempOrder = new int[5];
        for(int i =0; i<5; i++)
        {
        	if(hand4Num[i]==origh4[i] && !dm.containsInt(tempOrder, i))
        	{
        		tempOrder[i]=i;
        	} else if(hand4Num[i]==origh4[0] && !dm.containsInt(tempOrder, 0))
        	{
        		tempOrder[i]=0;
        	}else if(hand4Num[i]==origh4[1] && !dm.containsInt(tempOrder, 1))
        	{
        		tempOrder[i]=1;
        	}else if(hand4Num[i]==origh4[2] && !dm.containsInt(tempOrder, 2))
        	{
        		tempOrder[i]=2;
        	}else if(hand4Num[i]==origh4[3] && !dm.containsInt(tempOrder, 3))
        	{
        		tempOrder[i]=3;
        	}else if(hand4Num[i]==origh4[4] && !dm.containsInt(tempOrder, 4))
        	{
        		tempOrder[i]=4;
        	}
        }
        
        System.out.println("\n\n\nPlayer 4 Original Hand");
        for(String card : p4hand)
        {
        	System.out.print(card + ",");
        }
        System.out.println("\n\nSorted by suit");
        for(String card : h4S)
        {
        	System.out.print(card + ",");
        }
        p4hand=dm.switchArr(p4hand, tempOrder);
        System.out.println("\n\nSorted by number");
        for(String card : p4hand)
        {
        	System.out.print(card + ",");
        }
        System.out.println();
        
        System.out.print(isf1);
        System.out.print(isf2);
        System.out.print(isf3);
        System.out.print(isf4);
        if(isf1 || isf2 || isf3 || isf4)
        {
        	flushexist=true;
        }
        System.out.println();
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
    
}
