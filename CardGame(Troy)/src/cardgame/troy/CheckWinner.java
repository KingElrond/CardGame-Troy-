package cardgame.troy;

public class CheckWinner {
	public int p1pn,p2pn,p3pn,p4pn;
	public int[] h1n,h2n,h3n,h4n;
	public String[] h1s,h2s,h3s,h4s,h1sb,h2sb,h3sb,h4sb;
	public String p1="Player 1",p2="Player 2",p3="Player 3",p4="Player 4";
public boolean isf1,isf2,isf3,isf4,isS1,isS2,isS3,isS4,isfs1,isfs2,isfs3,isfs4,is3k1,is3k2,is3k3,is3k4,is4k1,is4k2,is4k3,is4k4, isfh,isfh2,isfh3,isfh4;
	public void recievestringandintarrs(int[] h1, int[] h2, int[] h3, int[] h4, String[] s1,String[] s2,String[] s3,String[] s4,String[] s1b,String[] s2b,String[] s3b,String[] s4b)
	{
		//doingsmalledittofixeclipse
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
									wfound=true;
								} else if(mn4 < mn1 && mn2 < mn1 && mn3 < mn1)
								{
									winner[1]="Player 1";
									winner[2]="four of a kind of: " + mn1;
									wfound=true;
								} else if(mn4 < mn2 && mn1 < mn2 && mn3 < mn2)
								{
									winner[1]="Player 2";
									winner[2]="four of a kind of: " + mn2;
									wfound=true;
								} else if(mn4 < mn3 && mn2 < mn3 && mn1 < mn3)
								{
									winner[1]="Player 3";
									winner[2]="four of a kind of: " + mn3;
									wfound=true;
								}
								
							} else
							{
								if(mn1 < mn3 && mn2 < mn3)
								{
									winner[1]="Player 3";
									winner[2]="four of a kind of: " + mn3;
									wfound=true;
								} else if(mn3 < mn1 && mn2 < mn1)
								{
									winner[1]="Player 1";
									winner[2]="four of a kind of: " + mn1;
									wfound=true;
								} else if(mn3 < mn2 && mn1 < mn2)
								{
									winner[1]="Player 2";
									winner[2]="four of a kind of: " + mn2;
									wfound=true;
								}
							}
						}
						else if(is4k4)
						{
							if(mn1 < mn4 && mn2 < mn4)
							{
								winner[1]="Player 4";
								winner[2]="four of a kind of: " + mn4;
								wfound=true;
							} else if(mn4 < mn1 && mn2 < mn1)
							{
								winner[1]="Player 1";
								winner[2]="four of a kind of: " + mn1;
								wfound=true;
							} else if(mn4 < mn2 && mn1 < mn2)
							{
								winner[1]="Player 2";
								winner[2]="four of a kind of: " + mn2;
								wfound=true;
							}
						} else
						{
							if(mn2 < mn1)
							{
								winner[1]="Player 1";
								winner[2]="four of a kind of: " + mn1;
								wfound=true;
							} else if(mn1 < mn2)
							{
								winner[1]="Player 2";
								winner[2]="four of a kind of: " + mn2;
								wfound=true;
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
								wfound=true;
							} else if(mn4 < mn1 && mn3 < mn1)
							{
								winner[1]="Player 1";
								winner[2]="four of a kind of: " + mn1;
								wfound=true;
							} else if(mn4 < mn3 && mn1 < mn3)
							{
								winner[1]="Player 3";
								winner[2]="four of a kind of: " + mn3;
								wfound=true;
							}
						} else
						{
							if(mn3 < mn1)
							{
								winner[1]="Player 1";
								winner[2]="four of a kind of: " + mn1;
								wfound=true;
							} else if(mn1 < mn3)
							{
								winner[1]="Player 3";
								winner[2]="four of a kind of: " + mn3;
								wfound=true;
							}
						}
					}
					else if(is4k4)
					{
						if(mn1 < mn4)
						{
							winner[1]="Player 4";
							winner[2]="four of a kind of: " + mn4;
							wfound=true;
						} else if(mn4 < mn1)
						{
							winner[1]="Player 1";
							winner[2]="four of a kind of: " + mn1;
							wfound=true;
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
								wfound=true;
							} else if(mn3 < mn4 && mn2 < mn4)
							{
								winner[1]="Player 4";
								winner[2]="four of a kind of: " + mn4;
								wfound=true;
							} else if(mn3 < mn2 && mn4 < mn2)
							{
								winner[1]="Player 2";
								winner[2]="four of a kind of: " + mn2;
								wfound=true;
							}
						} else
						{
							if(mn3 < mn2)
							{
								winner[1]="Player 2";
								winner[2]="four of a kind of: " + mn2;
								wfound=true;
							} else if(mn2 < mn3)
							{
								winner[1]="Player 3";
								winner[2]="four of a kind of: " + mn3;
								wfound=true;
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
							wfound=true;
						} else if(mn4 < mn3)
						{
							winner[1]="Player 3";
							winner[2]="four of a kind of: " + mn3;
							wfound=true;
						}
					}
				}
				else
				{
					
				}
			} else
			{
				if(is4k1)
				{
					winner[1]="Player 1";
					winner[2]="four of a kind of: " + mn1;
					wfound=true;
				} else if(is4k2)
				{
					winner[1]="Player 2";
					winner[2]="four of a kind of: " + mn2;
					wfound=true;
				} else if(is4k3)
				{
					winner[1]="Player 3";
					winner[2]="four of a kind of: " + mn3;
					wfound=true;
				} else if(is4k4)
				{
					winner[1]="Player 4";
					winner[2]="four of a kind of: " + mn4;
					wfound=true;
				} else
				{
					
				}
			}
			
			
		}
		//[end] fourofkindcheck
		
		
		
		//[start] fullhousecheck
		if(!wfound)
		{
			if(isfh || isfh2 || isfh3 || isfh4)
			{
			//[start] findsecondpairnum
			
			for(int abc=0; abc<5; abc++)
			{
				if(mn1!=h1n[abc])
				{
					p1pn=h1n[abc];
				}
				if(mn2!=h2n[abc])
				{
					p2pn=h2n[abc];
				}
				if(mn3!=h3n[abc])
				{
					p3pn=h3n[abc];
				}
				if(mn4!=h4n[abc])
				{
					p4pn=h4n[abc];
				}
			}
			
			//[end] findsecondpairnum
			if(mn1==1)
			{
				mn1=15;
			}
			if(mn2==1)
			{
			mn2=15;	
			}
			if(mn3==1)
			{
				mn3=15;
			}
			if(mn4==1)
			{
				mn4=15;
			}
			int highest=0;
			int[] t1 = new int[4], t2 = new int[4];
			if(isfh)
			{
				t1[0]=mn1;
				t2[0]=p1pn;
			} 
			if(isfh2)
			{
				t1[1]=mn2;
				t2[1]=p2pn;
			}
			if(isfh3)
			{
				t1[2]=mn3;
				t2[2]=p3pn;
			}
			if(isfh4)
			{
				t1[3]=mn4;
				t2[3]=p4pn;
			}
			
			
			
			
			for(int fi = 0; fi<4; fi++)
			{
				int temp=t1[fi];
				if(temp>highest)
				{
					highest=temp;
				}
			}
			if(highest!=0)
			{
				if(highest==mn1)
				{
					winner[1]=p1;
					wfound=true;
				}
				if(highest==mn2)
				{
					winner[1]=p2;
					wfound=true;
				}
				if(highest==mn3)
				{
					winner[1]=p3;
					wfound=true;
				}
				if(highest==mn4)
				{
					winner[1]=p4;
					wfound=true;
				}
			}
			
			if(winner[1]==p1)
			{
				winner[2]="Full House of: " + mn1 + " and " + p1pn;
			} else if(winner[1]==p2)
			{
				winner[2]="Full House of: " + mn2 + " and " + p2pn;
			} else if(winner[1]==p3)
			{
				winner[2]="Full House of: " + mn3 + " and " + p3pn;
			} else if(winner[1]==p4)
			{
				winner[2]="Full House of: " + mn4 + " and " + p4pn;
			}
			

			}
		}
		
		//[end] fullhousecheck
		
		
		
		//[start] flushcheck
		if(!wfound)
		{
			
		}
		
		//[end]flushcheck
				
		
		
		//[start] straightcheck
		if(!wfound)
		{
			
		}
		
		//[end] straightcheck
		
		
		
		//[start] threeofkindcheck
		if(!wfound)
		{
			
		}
		
		//[end] threeofkindcheck
		
		
		
		//[start] paircheck
		if(!wfound)
		{
			
		}
		
		//[end] paircheck
		
		
		
		//[start] nopaircheck
		if(!wfound)
		{
			
		}
		
		//[end] nopaircheck
		

		
		return winner;
		
	}
	
	
	
	
	
	
	
}
