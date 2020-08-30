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
		    str = str.replace("."," ");
		    //System.out.println(str);
		    String[] arr = str.split(" ");
		    for(int i=arr.length-1;i>0;i--)
		    {
		        System.out.print(arr[i]+".");
		    }
		    System.out.println(arr[0]);
		    //System.out.println();
		    //mno.pnr
		}
	}
}