import java.io.*;
import java.util.*;

public class CountWrd 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] arr = str.split(" ");
        for(String x:arr)
        {
            System.out.println(x+" "+x.length());
        }
    }    
}