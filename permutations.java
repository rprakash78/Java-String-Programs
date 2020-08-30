import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    private static void permutation(String c, String r)
	{
	    if(r.length()==0)
	    {
	        System.out.print(c+" ");
	    }
	    for(int i=0;i<r.length();i++)
	    {
	        String nc = c+r.charAt(i);
	        String nr = r.substring(0,i)+r.substring(i+1);
	        permutation(nc,nr);
	    }
	}
	public static void main (String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int k=0;k<t;k++)
		{
		    String str = in.next();
		    permutation(" ",str);
		    System.out.println();
		}
	}
}