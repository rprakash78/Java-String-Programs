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
            int x = in.nextInt();
            Arrays.sort(arr);
            System.out.println(arr[x-1]);
        }
	}
}