package com.learning.leetcode;

public class BestTimeToBuyAndSellStock {

	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length <= 1) {
			return 0;
		}
		int minPrice = prices[0];
		int maxProfit = 0;

		for (int i = 1; i < prices.length; i++) {
			int price = prices[i];
			if (price < minPrice) {
				minPrice = price;
			} else {
				int profit = price - minPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
		}

		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices = {1};
		int maxProfit = maxProfitByChatGpt(prices);
		System.out.println("Maximum Profit = " + maxProfit);

	}

	public static int maxProfitByChatGpt(int[] prices) {
		if (prices == null) {
			return 0;
		}
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int price : prices) {

			if (price < minPrice) {
				minPrice = price;
			} else {
				int profit = price - minPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
		}

		return maxProfit;
	}

}
