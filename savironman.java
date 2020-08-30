/*Constraints:
1<=T<=100
1<=|S|<=100000
Note: Consider alphabets and numbers only for palindrome check. Ignore symbols and whitespaces.

Example:
Input:
2
I am :IronnorI Ma, i
Ab?/Ba

Output:
YES
YES
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
		    String str = in.nextLine();
		    str = str.replaceAll("[^a-zA-Z-0-9]"," ");
		    str = str.replaceAll(" ","").toLowerCase();
		    //System.out.println(str);
		    String s="";
		    for(int j=str.length()-1;j>=0;j--)
		    {
		        s+=str.charAt(j);
		    }
		    if(str.equals(s))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}