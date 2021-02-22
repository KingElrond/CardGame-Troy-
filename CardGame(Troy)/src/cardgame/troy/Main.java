/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.troy;

import java.util.Arrays;

/**
 *
 * @author troyd
 */

public class Main {

    /**
     * @param args the command line arguments
     */
	//Check line 295 for manual hand value setting
    public static void main(String[] args) {
    	int runsthruprogram = 0;
    	boolean flushexist = false;
    	while(!flushexist)
    	{
int hkt1 = 0,hkt2 = 0,hkt3 = 0,hkt4 = 0;
String[] hand1, h1S, p2hand, p3hand, p4hand, h2S, h3S,h4S,h1d,h2d,h3d,h4d, winner;
int[] hand1Num, origh1, tempOrder, origh2, origh3, hand2Num, hand3Num, hand4Num, origh4, counter1,counter2,counter3,counter4;
boolean isf1,isf2,isf3,isf4,isS1,isS2,isS3,isS4,isfs1,isfs2,isfs3,isfs4,is3k1=false,is3k2=false,is3k3=false,is3k4=false,is4k1=false,is4k2=false,is4k3=false,is4k4=false, isfh=false,isfh2=false,isfh3=false,isfh4=false;
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
        
        
        /* for checking if it detects
        h1d[0]="D";
        h1d[1]="H";
        h1d[2]="S";
        h1d[3]="D";
        h1d[4]="D";
        
        hand1Num[0]=1;
        hand1Num[1]=1;
        hand1Num[2]=1;
        hand1Num[3]=1;
        hand1Num[4]=1;
        
        h2d[0]="D";
        h2d[1]="H";
        h2d[2]="S";
        h2d[3]="D";
        h2d[4]="D";
        
        hand2Num[0]=1;
        hand2Num[1]=1;
        hand2Num[2]=1;
        hand2Num[3]=1;
        hand2Num[4]=1;
        
        h3d[0]="D";
        h3d[1]="H";
        h3d[2]="S";
        h3d[3]="D";
        h3d[4]="D";
        
        hand3Num[0]=1;
        hand3Num[1]=1;
        hand3Num[2]=1;
        hand3Num[3]=1;
        hand3Num[4]=1;
        
        h4d[0]="D";
        h4d[1]="H";
        h4d[2]="S";
        h4d[3]="D";
        h4d[4]="D";
        
        hand4Num[0]=1;
        hand4Num[1]=1;
        hand4Num[2]=1;
        hand4Num[3]=1;
        hand4Num[4]=1;
        
        
        */
        
        
        eh.checkFlush(h1d);
        isf1=eh.returnflush();
        eh.checkStraight(hand1Num);
        isS1=eh.retStraight();
        eh.straightFlush();
        isfs1=eh.retisboth();
        eh.check4ofkind(hand1Num);
        counter1=eh.getcounter();
        
        EvaluateHand eh2 = new EvaluateHand();
        eh2.checkFlush(h2d);
        isf2=eh2.returnflush();
        eh2.checkStraight(hand2Num);
        isS2=eh2.retStraight();
        eh2.straightFlush();
        isfs2=eh2.retisboth();
        eh2.check4ofkind(hand2Num);
        counter2=eh2.getcounter();
        
        EvaluateHand eh3 = new EvaluateHand();
        eh3.checkFlush(h3d);
        isf3=eh3.returnflush();
        eh3.checkStraight(hand3Num);
        isS3=eh3.retStraight();
        eh3.straightFlush();
        isfs3=eh3.retisboth();
        eh3.check4ofkind(hand3Num);
        counter3=eh3.getcounter();
        
        EvaluateHand eh4 = new EvaluateHand();
        eh4.checkFlush(h4d);
        isf4=eh4.returnflush();
        eh4.checkStraight(hand4Num);
        isS4=eh4.retStraight();
        eh4.straightFlush();
        isfs4=eh4.retisboth();
        eh4.check4ofkind(hand4Num);
        counter4=eh4.getcounter();
        
        for(int i=0; i<5; i++)
        {
        	if(counter1[i]==2)
        	{
        		for(int g=0; g<5; g++)
        		{
        			if(counter1[g]==3)
        			{
        				is3k1=true;
        				hkt1=hand1Num[2];
        				isfh=true;
        			}
        		}
        	}
        	if(counter2[i]==2)
        	{
        		for(int g=0; g<5; g++)
        		{
        			if(counter2[g]==3)
        			{
        				is3k2=true;
        				hkt2=hand2Num[2];
        				isfh2=true;
        			}
        		}
        	}
        	if(counter3[i]==2)
        	{
        		for(int g=0; g<5; g++)
        		{
        			if(counter3[g]==3)
        			{
        				is3k3=true;
        				hkt3=hand3Num[2];
        				isfh3=true;
        			}
        		}
        	}
        	if(counter4[i]==2)
        	{
        		for(int g=0; g<5; g++)
        		{
        			if(counter4[g]==3)
        			{
        				is3k4=true;
        				hkt4=hand4Num[2];
        				isfh4=true;
        			}
        		}
        	}
        	
        	
        	if(counter1[i]==3)
        	{
        		is3k1=true;
        		hkt1=hand1Num[2];
        		for(int g=0; g<5; g++)
        		{
        			if(counter1[g]==2)
        			{
        				isfh=true;
        			}
        		}
        	}
        	if(counter2[i]==3)
        	{
        		is3k2=true;
        		hkt2=hand2Num[2];
        		for(int g=0; g<5; g++)
        		{
        			if(counter2[g]==2)
        			{
        				isfh2=true;
        			}
        		}
        	}
        	if(counter3[i]==3)
        	{
        		is3k3=true;
        		hkt3=hand3Num[2];
        		for(int g=0; g<5; g++)
        		{
        			if(counter3[g]==2)
        			{
        				isfh3=true;
        			}
        		}
        	}
        	if(counter4[i]==3)
        	{
        		is3k4=true;
        		hkt4=hand4Num[2];
        		for(int g=0; g<5; g++)
        		{
        			if(counter4[g]==2)
        			{
        				isfh4=true;
        			}
        		}
        	}
        	
        	//checks for 4 of kind
        	
        	if(counter1[i]==4)
        	{
        		is4k1=true;
        		hkt1=hand1Num[2];
        	}
        	if(counter2[i]==4)
        	{
        		is4k2=true;
        		hkt2=hand2Num[2];
        	}
        	if(counter3[i]==4)
        	{
        		is4k3=true;
        		hkt3=hand3Num[2];
        	}
        	if(counter4[i]==4)
        	{
        		is4k4=true;
        		hkt4=hand4Num[2];
        	}
        	
        }
        
        
        
        
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
        
        System.out.println("Flush");
        System.out.println(isf1);
        System.out.println(isf2);
        System.out.println(isf3);
        System.out.println(isf4);
        System.out.println("Straight");
        System.out.println(isS1);
        System.out.println(isS2);
        System.out.println(isS3);
        System.out.println(isS4);
        System.out.println("Straight Flush");
        System.out.println(isfs1);
        System.out.println(isfs2);
        System.out.println(isfs3);
        System.out.println(isfs4);
        System.out.println("3 of a kinds");
        System.out.println(is3k1);
        if(is3k1)
        {
        	System.out.println("card type: " + hkt1);
        }
        System.out.println(is3k2);
        if(is3k2)
        {
        	System.out.println("card type: " + hkt2);
        }
        System.out.println(is3k3);
        if(is3k3)
        {
        	System.out.println("card type: " + hkt3);
        }
        System.out.println(is3k4);
        if(is3k4)
        {
        	System.out.println("card type: " + hkt4);
        }
        System.out.println("4 of a kinds");
        System.out.println(is4k1);
        if(is4k1)
        {
        	System.out.println("card type: " + hkt1);
        }
        System.out.println(is4k2);
        if(is4k2)
        {
        	System.out.println("card type: " + hkt2);
        }
        System.out.println(is4k3);
        if(is4k3)
        {
        	System.out.println("card type: " + hkt3);
        }
        System.out.println(is4k4);
        if(is4k4)
        {
        	System.out.println("card type: " + hkt4);
        }
        System.out.println("Full Houses");
        System.out.println(isfh);
        if(is3k1)
        {
        	System.out.println("3 of a kind card type: " + hkt1);
        }
        System.out.println(isfh2);
        if(is3k2)
        {
        	System.out.println("3 of a kind card type: " + hkt2);
        }
        System.out.println(isfh3);
        if(is3k3)
        {
        	System.out.println("3 of a kind card type: " + hkt3);
        }
        System.out.println(isfh4);
        if(is3k4)
        {
        	System.out.println("3 of a kind card type: " + hkt4);
        }
        
        //figuring out who won
        
        CheckWinner cw = new CheckWinner();
        cw.recieve24bools(isf1,isf2,isf3,isf4,isS1,isS2,isS3,isS4,isfs1,isfs2,isfs3,isfs4,is3k1,is3k2,is3k3,is3k4,is4k1,is4k2,is4k3,is4k4, isfh,isfh2,isfh3,isfh4);
        cw.recievestringandintarrs(hand1Num,hand2Num,hand3Num,hand4Num, h1S, h2S, h3S, h4S, h1d, h2d, h3d, h4d);
        winner=cw.findWinner();
        System.out.println(winner[1] + " won with a " + winner[2]);
        
        
        //this checks for straightflush and only ends program when 1 is found
        /*
        if(isfs1 || isfs2 || isfs3 || isfs4)
        {
        	flushexist=true;
        }
        if(isf1 || isf2 || isf3 || isf4)
        {
        	flushexist=true;
        }
        if(isS1 || isS2 || isS3 || isS4)
        {
        	flushexist=true;
        }
        
        if(is3k1 || is3k2 || is3k3 || is3k4)
        {
        	flushexist=true;
        	
        }
        
        if(is4k1 || is4k2 || is4k3 || is4k4)
        {
        	
            	flushexist=true;
            
        }
        */
        if(isfh || isfh2 || isfh3 || isfh4)
        {
        	flushexist=true;
        }
        
        
        
        /* for benchmarking your pc. this checks if there are 2 straightflushes. the chance of this occurring is 0.00000000023687585
        if(isfs1 && isfs2 || isfs1 && isfs3 || isfs1 && isfs4 || isfs2 && isfs3 || isfs2 && isfs4 || isfs3 && isfs4)
        {
			flushexist=true;
            
        }
        System.out.println();
        */
        
        runsthruprogram++;
        System.out.println(runsthruprogram);
        System.out.println();
        /*
        System.out.println("printing deck");
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
