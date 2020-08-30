//Method 1:

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int sum = 0;
        int pre = prices[0];
        for (int i : prices) {
            if (i > pre) sum += i - pre;
            pre = i;
        }
        return sum;
    }
}

//Method 2:

class Solution 
{
    public int maxProfit(int[] prices) 
    {
        if(prices==null || prices.length==0)
        {
            return 0;
        }
        int profit=0;
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i+1]>prices[i])
            {
                profit+=prices[i+1]-prices[i];
            }
        }
        return profit;
    }
}