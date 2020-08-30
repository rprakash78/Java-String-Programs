/*You are required to complete this method */
class GfG
{
    int atoi(String str)
    {
	    try
	    {
	        int num = Integer.parseInt(str);
	        return num;
	    }
	    catch(Exception e)
	    {
	        return -1;
	    }
    }
}