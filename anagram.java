import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int k=0;k<t;k++)
		{
		    String s1 = in.next();
		    String s2 = in.next();
		    char[] arr1 = s1.toCharArray();
		    char[] arr2 = s2.toCharArray();
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    String a1 = new String(arr1);
		    String a2 = new String(arr2);
		    if(a1.equals(a2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}