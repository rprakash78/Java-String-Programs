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
		        arr[i] = in.nextInt();
		    }
		    
		    int i=0,j=1;
		    boolean flag = true;
		    int temp;
		    while(j<n)
		    {
		        if(flag)
		        {
		            if(arr[i]>arr[j])
		            {
		                temp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = temp;
		            }
		            flag = false;
		        }
		        else
		        {
		            if(arr[i]<arr[j])
		            {
		                temp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = temp;   
		            }
		            flag = true;
		        }
		        i++;
		        j++;
		    }
		    
		    for(int x:arr)
		    {
		        System.out.print(x+" ");
		    }
		    System.out.println();
		}
	}
}