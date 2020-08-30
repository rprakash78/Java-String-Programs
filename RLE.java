class GfG
 {
	String encode(String str)
	{
        int n = str.length();
        String res = "";
        for(int i=0;i<n;i++)
        {
            int count = 1;
            while(i<n-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            } 
            res+=str.charAt(i);
            res+=count;
        }
        return res;
	}
	
 }