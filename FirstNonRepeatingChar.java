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
		    int len = in.nextInt();
		    String str = in.next();
		    int[] frq = new int[26];
		    Arrays.fill(frq,0);
		    
		    Queue<Character> q = new LinkedList<Character>();
		    for(int i=0;i<len;i++)
		    {
		        q.add(str.charAt(i));
		        frq[str.charAt(i)-'a']++;
		        while(!q.isEmpty())
		        {
		            if(frq[q.peek()-'a']>1)
		            {
		                q.remove();
		            }
		            else
		            {
		                break;
		            }
		        }
		    }
		    if(q.isEmpty())
		    {
		        System.out.println(-1);
		    }
		    else
		    {
		        System.out.println(q.peek());
		    }
		}
	}
}