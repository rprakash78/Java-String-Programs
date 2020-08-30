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
	        int[] arr = new int[n];
	        int[] arr1 = new int[n];
	        int[] arr2 = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i] = in.nextInt();
	        }
	        int maxl=0;
	        for(int i=0;i<n;i++)
	        {
	           if(maxl<arr[i])
	           {
	               maxl=arr[i];
	           }
	           arr1[i] = maxl;
	        }
	        //System.out.print(Arrays.toString(arr1));
	        int maxr=0;
	        for(int i=n-1;i>=0;i--)
	        {
	            if(maxr<arr[i])
	            {
	                maxr=arr[i];
	            }
	            arr2[i]=maxr;
	        }
	        //System.out.print(Arrays.toString(arr2));
	        int tot=0;
	        for(int i=0;i<n;i++)
	        {
	            int index = Math.min(arr1[i],arr2[i])-arr[i];
	            tot+=index;
	        }
	        System.out.println(tot);
	    }
	}
}