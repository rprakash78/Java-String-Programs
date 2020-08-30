import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[])
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
            int sum=0,ans=-1,lsum=0;
            for(int  i=0;i<n;i++)
            {
                sum+=arr[i];
            }
            
            for(int i=0;i<n;i++)
            {
                sum-=arr[i];
                if(sum==lsum)
                {
                    ans=i+1;
                    System.out.println(ans);
                }
                lsum+=arr[i];
            }
            if(ans<=0)
            {
                System.out.println(-1);
            }
        }
    }
}