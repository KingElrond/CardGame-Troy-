package cardgame.troy;

public class CheckWinner {
	public int[] h1n,h2n,h3n,h4n;
	public String[] h1s,h2s,h3s,h4s,h1sb,h2sb,h3sb,h4sb;
public boolean isf1,isf2,isf3,isf4,isS1,isS2,isS3,isS4,isfs1,isfs2,isfs3,isfs4,is3k1,is3k2,is3k3,is3k4,is4k1,is4k2,is4k3,is4k4, isfh,isfh2,isfh3,isfh4;
	public void recievestringandintarrs(int[] h1, int[] h2, int[] h3, int[] h4, String[] s1,String[] s2,String[] s3,String[] s4,String[] s1b,String[] s2b,String[] s3b,String[] s4b)
	{
		h1n=h1;
		h2n=h2;
		h3n=h3;
		h4n=h4;
		h1s=s1;
		h2s=s2;
		h3s=s3;
		h4s=s4;
		h1sb=s1b;
		h2sb=s2b;
		h3sb=s3b;
		h4sb=s4b;
	}
	public void recieve24bools(boolean a, boolean b,boolean c,boolean d,boolean e,boolean f,boolean g,boolean h, boolean i,boolean j,boolean k,boolean l,boolean m,boolean n,boolean o,boolean p,boolean q,boolean r,boolean s, boolean t,boolean u,boolean v,boolean w,boolean x)
	{
		//this sucks
		isf1=a;
		isf2=b;
		isf3=c;
		isf4=d;
		isS1=e;
		isS2=f;
		isS3=g;
		isS4=h;
		isfs1=i;
		isfs2=j;
		isfs3=k;
		isfs4=l;
		is3k1=m;
		is3k2=n;
		is3k3=o;
		is3k4=p;
		is4k1=q;
		is4k2=r;
		is4k3=s;
		is4k4=t;
		isfh=u;
		isfh2=v;
		isfh3=w;
		isfh4=x;
	}
	
	public String[] findWinner()
	{
		int mn1=h1n[2],mn2=h2n[2],mn3=h3n[2],mn4=h4n[2];
		String[] winner= new String[3];
		boolean wfound=false;
		//[start] straightflushcheck
		if(isfs1)
		{
			winner[1]="Human";
			winner[2]="Straight Flush";
			wfound=true;
		}
		if(isfs2)
		{
			winner[1]="Player 2";
			winner[2]="Straight Flush";
			wfound=true;
		}
		if(isfs3)
		{
			winner[1]="Player 3";
			winner[2]="Straight Flush";
			wfound=true;
		}
		if(isfs4)
		{
			winner[1]="Player 4";
			winner[2]="Straight Flush";
			wfound=true;
		}
		//[end] straightflushcheck
		
		
		
		//[start] fourofkindcheck
		
		if(!wfound)
		{
			int counter =0;
			if(is4k1)
			{
				counter++;
			}
			if(is4k2)
			{
				counter++;
			}
			if(is4k3)
			{
				counter++;
			}
			if(is4k4)
			{
				counter++;
			}
			
			if(counter>1)
			{
				if(is4k1)
				{
					if(is4k2)
					{
						if(is4k3)
						{
							if(is4k4)
							{
								if(mn1 < mn4 && mn2 < mn4 && mn3 < mn4)
								{
									winner[1]="Player 4";
									winner[2]="four of a kind of: " + mn4;
								} else if(mn4 < mn1 && mn2 < mn1 && mn3 < mn1)
								{
									winner[1]="Player 1";
									winner[2]="four of a kind of: " + mn1;
								} else if(mn4 < mn2 && mn1 < mn2 && mn3 < mn2)
								{
									winner[1]="Player 2";
									winner[2]="four of a kind of: " + mn2;
								} else if(mn4 < mn3 && mn2 < mn3 && mn1 < mn3)
								{
									winner[1]="Player 3";
									winner[2]="four of a kind of: " + mn3;
								}
								
							} else
							{
								if(mn1 < mn3 && mn2 < mn3)
								{
									winner[1]="Player 3";
									winner[2]="four of a kind of: " + mn3;
								} else if(mn3 < mn1 && mn2 < mn1)
								{
									winner[1]="Player 1";
									winner[2]="four of a kind of: " + mn1;
								} else if(mn3 < mn2 && mn1 < mn2)
								{
									winner[1]="Player 2";
									winner[2]="four of a kind of: " + mn2;
								}
							}
						}
						else if(is4k4)
						{
							if(mn1 < mn4 && mn2 < mn4)
							{
								winner[1]="Player 4";
								winner[2]="four of a kind of: " + mn4;
							} else if(mn4 < mn1 && mn2 < mn1)
							{
								winner[1]="Player 1";
								winner[2]="four of a kind of: " + mn1;
							} else if(mn4 < mn2 && mn1 < mn2)
							{
								winner[1]="Player 2";
								winner[2]="four of a kind of: " + mn2;
							}
						} else
						{
							if(mn2 < mn1)
							{
								winner[1]="Player 1";
								winner[2]="four of a kind of: " + mn1;
							} else if(mn1 < mn2)
							{
								winner[1]="Player 2";
								winner[2]="four of a kind of: " + mn2;
							}
						}
					}
					else if(is4k3)
					{
						if(is4k4)
						{
							if(mn1 < mn4 && mn3 < mn4)
							{
								winner[1]="Player 4";
								winner[2]="four of a kind of: " + mn4;
							} else if(mn4 < mn1 && mn3 < mn1)
							{
								winner[1]="Player 1";
								winner[2]="four of a kind of: " + mn1;
							} else if(mn4 < mn3 && mn1 < mn3)
							{
								winner[1]="Player 3";
								winner[2]="four of a kind of: " + mn3;
							}
						} else
						{
							if(mn3 < mn1)
							{
								winner[1]="Player 1";
								winner[2]="four of a kind of: " + mn1;
							} else if(mn1 < mn3)
							{
								winner[1]="Player 3";
								winner[2]="four of a kind of: " + mn3;
							}
						}
					}
					else if(is4k4)
					{
						if(mn1 < mn4)
						{
							winner[1]="Player 4";
							winner[2]="four of a kind of: " + mn4;
						} else if(mn4 < mn1)
						{
							winner[1]="Player 1";
							winner[2]="four of a kind of: " + mn1;
						}
					}
				}
				else if(is4k2)
				{
					if(is4k3)
					{
						if(is4k4)
						{
							if(mn4 < mn3 && mn4 < mn3)
							{
								winner[1]="Player 3";
								winner[2]="four of a kind of: " + mn3;
							} else if(mn3 < mn4 && mn2 < mn4)
							{
								winner[1]="Player 4";
								winner[2]="four of a kind of: " + mn4;
							} else if(mn3 < mn2 && mn4 < mn2)
							{
								winner[1]="Player 2";
								winner[2]="four of a kind of: " + mn2;
							}
						} else
						{
							if(mn3 < mn2)
							{
								winner[1]="Player 2";
								winner[2]="four of a kind of: " + mn2;
							} else if(mn2 < mn3)
							{
								winner[1]="Player 3";
								winner[2]="four of a kind of: " + mn3;
							}
						}
					}
				}
				else if(is4k3)
				{
					if(is4k4)
					{
						if(mn3 < mn4)
						{
							winner[1]="Player 4";
							winner[2]="four of a kind of: " + mn4;
						} else if(mn4 < mn3)
						{
							winner[1]="Player 3";
							winner[2]="four of a kind of: " + mn3;
						}
					}
				}
				else
				{
					
				}
			}
			
			
		}
		//[end] fourofkindcheck
		
		
		return winner;
		
	}
	
	
	
	
	
	
	
}
