from typing import List

class Solution:

    def maxProfit(prices):
        min_price = float('inf')
        max_profit = 0

        for price in prices:
            min_price = min(min_price, price)
            profit = price - min_price
            max_profit = max(max_profit, profit)

        return max_profit




















    def maxProfit(prices):
        min_price = float('inf')
        max_profit = 0

        for price in prices:
            min_price = min(min_price, price)       # track lowest price so far
            profit = price - min_price              # potential profit if sold today
            max_profit = max(max_profit, profit)    # track best profit so far

        return max_profit












