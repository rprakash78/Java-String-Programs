import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int k=0;k<t;k++)
		{
		    int m = in.nextInt();
		    int n = in.nextInt();
		    int[] arr1 = new int[m];
		    int[] arr2 = new int[n];
		    for(int i=0;i<m;i++)
		    {
		        arr1[i]=in.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        arr2[i]=in.nextInt();
		    }
		    int count=0;
		    for(int i=0;i<m;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            if(Math.pow(arr1[i],arr2[j])>Math.pow(arr2[j],arr1[i]))
		            {
		               count++; 
		            }
		        }
		    }
		    System.out.println(count);
		}
	}
}