class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        int dailyProfit = 0;

        for(int i=1; i<prices.length; i++){
            dailyProfit = Math.max(0,(prices[i] - prices[i-1]));
            totalProfit += dailyProfit;
        }

        return totalProfit;

    }
}
