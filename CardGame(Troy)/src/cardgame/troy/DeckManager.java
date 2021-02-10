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
        unshuffledDeck = new ArrayList<>(Arrays.asList(""
        		,"S1","S10","S9","S8","S7","S6","S5","S4","S3","S2","S13","S12","S11",""
                + "H1","H10","H9","H8","H7","H6","H5","H4","H3","H2","H13","H12","H11",""
                        + "D1","D10","D9","D8","D7","D6","D5","D4","D3","D2","D13","D12","D11",""
                                + "C1","C10","C9","C8","C7","C6","C5","C4","C3","C2","C13","C12","C11"));
        
     
 }
public void shuffleInit()
{
    shuffleDeck();
}

private void shuffleDeck()
{
	ShuffledDeck.clear();
    boolean isrepeat=false;
    int randNum = (int) (Math.random() * (53 - 1)) + 1;;
    for(int i=0; i<unshuffledDeck.size()-1; i++)
    {
        isrepeat=true;
        while(isrepeat)
        {
            boolean stupidBool = false;
        randNum = (int) (Math.random() * (53 - 1)) + 1;
        if(!ShuffledDeck.isEmpty())
        {
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
        } else
        {
         isrepeat=false;
        }
        }
    ShuffledDeck.add(randNum);
    }
    
}

public String drawCard()
{
    int cardtypenum=ShuffledDeck.get(0);
    ShuffledDeck.remove(0);
    String cardtoreturn = unshuffledDeck.get(cardtypenum);
  return cardtoreturn;
}
    

public String[] switchArr(String[] a, int[] b)
{
	String[] newArr;
	newArr = new String[5];
	for(int i=0;i<5;i++)
	{
		int g = b[i];
		newArr[i] = a[g];
	}
	
	return newArr;
}

public String[] sortStr(String[] a)
{
	  int wordAmount=a.length;
	  String[] wordArray;
	  wordArray=a;
	  String temp;
	  for (int i = 0; i < wordAmount; i++) 
    {
        for (int j = i + 1; j < wordAmount; j++) { 
            if (wordArray[i].compareTo(wordArray[j])>0) 
            {
                temp = wordArray[i];
                wordArray[i] = wordArray[j];
                wordArray[j] = temp;
            }
        }
    }
	  
	return wordArray;
	  
}

public boolean containsInt(int[] array, int a){
	  for(int i = 0; i < array.length; i++){
		    if(array[i] == a){
		      return true;
		    }
		  }
		  return false;
		}

}
