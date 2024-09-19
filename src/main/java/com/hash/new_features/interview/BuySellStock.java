package com.hash.new_features.interview;

public class BuySellStock {

    public static void main(String[] args) {
        // Example test case
        int[] prices = {7, 1, 5, 3, 6, 4};

        int[] prices1 = {3, 1, 4, 8, 7, 2, 5};

        // Calculate and print the maximum profit
        System.out.println("Maximum Profit: " + maxProfit(prices));  // Output should be 5
        System.out.println("Maximum Profit: " + maxProfit(prices1));
    }

    private static int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;  // If prices array is empty, return 0
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}
