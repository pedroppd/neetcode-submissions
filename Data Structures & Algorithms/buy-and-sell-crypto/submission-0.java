class Solution {
    public int maxProfit(int[] prices) {
        int bestPrice = prices[0];
        int bestProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < bestPrice) {
                bestPrice = prices[i];
            }

            if(prices[i] - bestPrice > bestProfit) {
                bestProfit = prices[i] - bestPrice;
            }
        }
        return bestProfit;
    }
}
