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
		    int x = in.nextInt();
		    int first=-1;
		    boolean flag = false;
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]==x)
		        {
		            first=i;
		            flag=true;
		            break;
		        }
		    }
		   
		    int end = first;
		    boolean flag1= false;
		    for(int i = n-1;i>first;i--)
		    {
		        if(arr[i]==x)
		        {
		            end = i;
		            flag1=true;
		            break;
		        }
		    }
		    if(flag == false && flag1==false)
		    {
		        System.out.println(-1);
		    }
		    else
		    {
		        System.out.println(first+" "+end);
		    }
		}
	}
}