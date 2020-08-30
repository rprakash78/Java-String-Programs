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
		    
		    int[] left = new int[n];
		    int[] right = new int[n];
		    int res=-1;
		    left[0] = Integer.MIN_VALUE;
		    for(int i=1;i<n;i++)
		    {
		        left[i]=Math.max(left[i-1],arr[i-1]);
		    }
		    //System.out.println(Arrays.toString(left));
		    right[n-1] = Integer.MAX_VALUE;
		    
		    for(int i=n-2;i>=0;i--)
		    {
		        right[i] = Math.min(right[i+1],arr[i+1]);
		    }
		    //System.out.println(Arrays.toString(right));
		    for(int i=1;i<n-1;i++)
		    {
		        if(arr[i]>=left[i] && arr[i]<=right[i])
		        {
		            res = arr[i];
		            break;
		        }
		    }
		    if(res>0)
		    {
		        System.out.println(res);
		    }
		    else
		    {
		        System.out.println(-1);
		    }
		}
	}
}