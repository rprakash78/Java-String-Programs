import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int k=0;k<t;k++)
        {
            int n = in.nextInt();
            int[] arr = new int[n];
            int[] arr2 = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
            }
            int left = 0;
            int right = n-1;
            for(int i=0;i<n;i++)
            {
                if(i%2==0)
                {
                    arr2[i]=arr[right];
                    right--;
                }
                else
                {
                    arr2[i]=arr[left];
                    left++;
                }
            }
            
            for(int i=0;i<n;i++)
            {
                System.out.print(arr2[i]+" ");
            }
            System.out.println(" ");
        }
	}
}