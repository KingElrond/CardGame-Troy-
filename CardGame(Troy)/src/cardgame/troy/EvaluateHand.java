package cardgame.troy;

public class EvaluateHand {
public int counter=0;
public boolean isflush;


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
	
}
