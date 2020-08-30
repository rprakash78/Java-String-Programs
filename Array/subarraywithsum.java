import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int k=0;k<t;k++)
		{
		    int num = in.nextInt();
		    int sum = in.nextInt();
		    int[] arr = new int[num];
		    
		    for(int i=0;i<num;i++)
		    {
		        arr[i] = in.nextInt();
		    }
		    
		    int header=0;
		    int cursum=0;
		    int flag=0;
		    for(int i=0;i<num;i++)
		    {
		        cursum+=arr[i];
		        while(cursum>sum)
		        {
		            cursum=cursum-arr[header];
		            header++;
		        }
		        if(cursum==sum)
		        {
		            flag=1;
		            System.out.println((header+1)+" "+(i+1));
		            break;
		        }
		    }
		    if(flag==0)
		    {
		        System.out.println(-1);
		    }
		    //t--;
		}
	}
}