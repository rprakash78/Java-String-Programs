import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int k=0;k<t;k++)
		{
		    String str = in.next();                  //aaaabbaa
		    System.out.println(longpal(str));
		}
	}
	private static String longpal(String inp)
	{
	    if(inp.isEmpty())
	    {
	        return "";
	    }
	    int n = inp.length();                        //8
	    int strt = 0,end=0,sofar=0;
	    boolean[][] pal = new boolean[n][n];
	    
	    for(int j=0;j<n;j++)
	    {
	        pal[j][j]=true;
	        for(int i=0;i<j;i++)
	        {
	            if(inp.charAt(i)==inp.charAt(j)&&(j-i<=2||pal[i+1][j-1]))
	            {
	                pal[i][j]=true;
	                if(j-i+1>sofar)
	                {
	                    sofar=j-i+1;
	                    strt=i;
	                    end=j;
	                }
	            }
	        }
	    }
	    return inp.substring(strt,end+1);
	}
}