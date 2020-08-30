import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
    	Scanner in = new Scanner(System.in);
    	int t=in.nextInt();
    	for(int m=0;m<t;m++)
    	{
    	    int n = in.nextInt();
    	    int[] arr = new int[n];
    	    for(int i=0;i<n;i++)
    	    {
    	        arr[i]=in.nextInt();
    	    }
    	    int count=0;
    	    for(int i=0;i<n;i++)
    	    {
    	        int x = arr[i];
    	        for(int j=0;j<n;j++)
    	        {
    	            int y = arr[j];
    	            for(int k=0;k<n;k++)
    	            {
    	                int z = arr[k];
    	                if((x*x)+(y*y)==(z*z))
    	                {
    	                   count+=1;
    	                   break;
    	                }
    	            }
    	        }
    	    }
    	    if(count>0)
    	    {
    	        System.out.println("Yes");
    	    }
    	    else
    	    {
    	        System.out.println("No");
    	    }
    	}
	    
	}
}