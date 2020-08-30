import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++)
		{
		    String s1 = in.next();
		    String s2 = in.next();
		    if(s1.length()!=s2.length())
		    {
		        System.out.println(0);
		    }
		    String aclk="";
		    String clk="";
		    int len = s2.length();
		    aclk += s2.substring(len-2,len)+s2.substring(0,len-2);
		    clk+=s2.substring(2)+s2.substring(0,2);
		    if(s1.equals(aclk)||s1.equals(clk))
		    {
		        System.out.println(1);
		    }
		    else
		    {
		        System.out.println(0);
		    }
		}
	}
}