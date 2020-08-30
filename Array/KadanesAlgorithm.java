/*package whatever //do not write package name here */

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
	        for(int i=0;i<n;i++)
	        {
	            arr[i] = in.nextInt();
	        }
	        int lcl = arr[0],gbl = arr[0];
	        for(int i=1;i<n;i++)
	        {
	            lcl = Math.max(arr[i],lcl+arr[i]);
	            gbl = Math.max(lcl,gbl);
	        }
	        System.out.println(gbl);
	    }
	}
}