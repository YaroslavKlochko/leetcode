public class BestTimetoBuyStocks121_2 {

    // variables for profit and min price
    //go over all of the elements
    // find min price and get max profit

    public int maxProfit(int[] prices) {
        int currentMinPrice = prices.length > 0 ? prices[0] : 0;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            currentMinPrice = Math.min(currentMinPrice, prices[i]);
            profit = Math.max(profit, prices[i] - currentMinPrice);
        }
        return profit;
    }

    public int maxProfit1(int[] prices) {
        int min = prices[0];//7
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {//7>1?
                min = prices[i];
            } else if (prices[i] - min > maxprofit) {
                maxprofit = prices[i] - min; //5
            }
        }
        return maxprofit;
    }
}