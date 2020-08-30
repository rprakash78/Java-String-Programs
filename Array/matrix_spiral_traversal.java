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
		    int r = in.nextInt();
		    int c = in.nextInt();
		   int[][] arr = new int[r][c];
		    
		    for(int i=0;i<r;i++)
		    {
		        for(int j=0;j<c;j++)
		        {
		            arr[i][j] = in.nextInt();
		        }
		    }
		    
		    int left=0;
		    int right=c-1;
		    int top=0;
		    int down =r-1;
		    int dir=0;
		    while(top<=down && left<=right)
		    {
		        if(dir==0)
		        {
		            for(int i=left;i<=right;i++)
		            {
		                System.out.print(arr[top][i]+" ");
		            }
		            top+=1;
		        }
		        else if(dir==1)
		        {
		            for(int i=top;i<=down;i++)
		            {
		                System.out.print(arr[i][right]+" ");   
		            }
		            right-=1;
		        }
		        else if(dir==2)
		        {
		            for(int i=right;i>=left;i--)
		            {
		                System.out.print(arr[down][i]+" ");
		            }
		            down-=1;
		        }
		        else if(dir==3)
		        {
		            for(int i=down;i>=top;i--)
		            {
		                System.out.print(arr[i][left]+" ");
		            }
		            left+=1;
		        }
		        dir=(dir+1)%4;
		    }
		    System.out.println();
		    /*for(int i=0;i<r;i++)
		    {
		        for(int j=0;j<c;j++)
		        {
		            System.out.print(arr[i][j]+" ");
		        }
		    }*/
		}
	}
}