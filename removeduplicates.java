import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		for(int k=0;k<t;k++)
		{
		    String str = in.nextLine();
		    char[] arr = str.toCharArray();
		    LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		    for(int i=0;i<arr.length;i++)
		    {
		        hs.add(arr[i]);
		    }
		    for(char x:hs)
		    {
		        System.out.print(x);
		    }
		    System.out.println();
		}
	}
}