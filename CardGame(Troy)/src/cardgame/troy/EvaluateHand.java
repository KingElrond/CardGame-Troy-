package cardgame.troy;

public class EvaluateHand {
public int counter=0;
public boolean isflush, isStraight, isBoth;


	public void checkFlush(String[] g)
	{
		if(g[0].equals(g[1]) && g[0].equals(g[2]) && g[0].equals(g[3]) && g[0].equals(g[4]))
		{
			isflush = true;
		}
	}
	
	public boolean returnflush()
	{
		return isflush;
		
	}
	
	public void checkStraight(int[] arr)
	{
		int n=arr.length;
		if (n < 1)
		{
            isStraight= false;
            return;
		}
  
        /* 1) Get the minimum element in array */
        int min = getMin(arr, n); 
  
        /* 2) Get the maximum element in array */
        int max = getMax(arr, n); 
  
        /* 3) max-min+1 is equal to n then only check all elements */
        if (max - min + 1 == n)  
        { 
            int i; 
            for (i = 0; i < n; i++)  
            { 
                int j; 
  
                if (arr[i] < 0) 
                    j = -arr[i] - min; 
                else
                    j = arr[i] - min; 
  
                // if the value at index j is negative then 
                // there is repitition 
                if (arr[j] > 0)  
                    arr[j] = -arr[j]; 
                else
                {
                	isStraight= false;
                	return;
                }
            } 
  
            /* If we do not see a negative value then all elements 
               are distinct */
            isStraight= true;
            return;
        } 
  
        isStraight= false; // if (max-min+1 != n)
		return;
		
		
	}
	
	int getMin(int arr[], int n)  
    { 
        int min = arr[0]; 
        for (int i = 1; i < n; i++)  
        { 
            if (arr[i] < min) 
                min = arr[i]; 
        } 
        return min; 
    } 
  
    int getMax(int arr[], int n)  
    { 
        int max = arr[0]; 
        for (int i = 1; i < n; i++)  
        { 
            if (arr[i] > max) 
                max = arr[i]; 
        } 
        return max; 
    } 
	
    public boolean retStraight()
    {
		return isStraight;
    	
    }
    
    public void straightFlush()
    {
    	if(isflush && isStraight)
    	{
    		isBoth=true;
    	}
    }
    
	public boolean retisboth()
	{
		return isBoth;
		
	}
}
