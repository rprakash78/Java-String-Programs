import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		in.nextLine();
		for(int i=0;i<t;i++)
		{
		    String r = in.next();
		    HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		    hm.put('I',1);
		    hm.put('V',5);
		    hm.put('X',10);
		    hm.put('L',50);
		    hm.put('C',100);
		    hm.put('D',500);
		    hm.put('M',1000);
		    
		    int res=0;
		    for(int k=0;k<r.length()-1;k++)
		    {
		        if(hm.get(r.charAt(k))>=hm.get(r.charAt(k+1)))
		        {
		            res+=hm.get(r.charAt(k));
		        }
		        else
		        {
		            res-=hm.get(r.charAt(k));
		        }
		    }
		    res+=hm.get(r.charAt(r.length()-1));
		    System.out.println(res);
		}
	}
}