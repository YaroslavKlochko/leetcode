package com.example;

public class BestTimetoBuyStocks {

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    //algorithm:

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
//Kadane's Algorithm