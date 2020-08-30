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
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=in.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	            int j;
	            for(j=i+1;j<n;j++)
	            {
	                if(arr[i]<=arr[j])
	                {
	                    break;
	                }
	            }
	            if(j==n)
	            {
	                System.out.print(arr[i]+" ");
	            }
	        }
	        System.out.println(" ");
	    }
	}
}