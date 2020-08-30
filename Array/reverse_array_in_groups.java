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
	        int n = in.nextInt();
	        int x = in.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i] = in.nextInt();
	        }
	        
	        for(int i=0;i<n;i+=x)
	        {
	            int start = i;
	            int end = Math.min(i+x-1,n-1);
	            
	            while(start<=end)
	            {
	                int temp = arr[start];
	                arr[start] = arr[end];
	                arr[end] = temp;
	                start++;
	                end--;
	            }
	        }
	        for(int val:arr)
	        {
	            System.out.print(val+" ");
	        }
	        System.out.println();
	    }
	}
}
	