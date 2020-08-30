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
		    String str = in.next();
		    char[] arr1 = str.toCharArray();
		    String res="";
		    Stack<Character> st = new Stack<Character>();
		    //Stack<Character> st1 = new Stack<Character>();
		    for(int i=0;i<arr1.length;i++)
		    {
		        if(st.empty())
		        {
		            st.push(arr1[i]);
		        }
		        else
		        {
		            if(st.peek()==arr1[i])
		            {
		                st.push(arr1[i]);
		                st.pop();
		            }
		            else
		            {
		                st.push(arr1[i]);
		            }
		        }
		    }
		    /*Object[] arr2 = st.toArray();
		    for(int x=0;x<arr2.length;x++)
		    {
		        res+=arr2[x]; 
		    }*/
		    System.out.println(st);
		}
	}
}