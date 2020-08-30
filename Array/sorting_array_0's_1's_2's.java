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
            for(int i=0;i<n;i++)
            {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            
            for(int x:arr)
            {
                System.out.print(x+" ");
            }
            System.out.println(" ");
        }
	}
}