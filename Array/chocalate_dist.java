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
            Arrays.sort(arr);
            int x = in.nextInt();
            int min = Integer.MAX_VALUE;
            int first=0,last=0;
            for(int i=0;i+x-1<n;i++)
            {
                int d = arr[i+x-1]-arr[i];
                if(d<min)
                {
                    min = d;
                    first = i;
                    last = i+x-1;
                }
            }
            System.out.println(arr[last]-arr[first]);
        }
	}
}