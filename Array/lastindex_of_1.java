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
		    String st = in.next();
		    Character[] str = new Character[st.length()];
		    for(int i=0;i<st.length();i++)
		    {
		        str[i] = st.charAt(i);
		    }
		    //System.out.println(Arrays.toString(str));
		    boolean flag = false;
		    int index = -1;
		    for(int i=0;i<st.length();i++)
		    {
		    	if(str[i]=='1')
		        {
		            index = i;
		            flag=true;
		        }
		        //System.out.println(index);
		    }
		    if(flag==true)
		    {
		        System.out.println(index);
		    }
		    else
		    {
		        System.out.println(-1);
		    }
		}
	}
}