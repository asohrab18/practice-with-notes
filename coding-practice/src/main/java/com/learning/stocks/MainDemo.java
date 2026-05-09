package com.learning.stocks;

import java.math.BigDecimal;

public class MainDemo {

	public static void main(String[] args) {
		BigDecimal baseValue = new BigDecimal("100");
		System.out.println("Basic Amount of a share = " + baseValue);
		BigDecimal quantity = new BigDecimal("1");
		System.out.println("Quantity of shares = " + quantity);
		BigDecimal finalBuyingCost = ShareMarket.getFinalBuyingCost(baseValue, quantity);
		System.out.println("Final Buying Cost = " + finalBuyingCost);
		System.out.println("================================================");

		BigDecimal sellValue = new BigDecimal("110");
		System.out.println("Sell Value of a share = " + sellValue);

		BigDecimal finalSellValueOfTotalShares = ShareMarket.getFinalSellingValue(sellValue, quantity);
		System.out.println("Final Sell Value Of Total Shares = " + finalSellValueOfTotalShares);
		System.out.println("================================================");
		BigDecimal profit = ShareMarket.subtract(finalSellValueOfTotalShares, finalBuyingCost);
		System.out.println("Actual profit = " + profit);

	}
}