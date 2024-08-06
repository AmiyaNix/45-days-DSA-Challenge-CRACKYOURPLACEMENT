import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            int sell = prices[i]-min;
            maxProfit = Math.max(maxProfit, sell);
            min = Math.min(prices[i], min);
        }
        return maxProfit;
    }
}
