package com.learning.stocks;

import java.math.BigDecimal;

public class MainDemo {

	public static void main(String[] args) {
		System.out.println("================= Check before buying a new stock ===================");
		String price = "100", qty = "100";
		BigDecimal averageCost = ShareMarket.calculateAverageCost(price, qty);
		System.out.println("Current price of a new share = " + price);
		System.out.println("Quantity to be ordered = " + qty);
		System.out.println("Average Cost after all charges and 18% GST = " + averageCost);

		System.out.println("\n\n================= Check before selling the shares ===================");
		calculateActualProfitOnSell("100", "100.12", "120", "10012", 6);
	}

	/**
	 * When I sell my shares then I get actual profit/loss after deductions of
	 * charges and tax as applicable.
	 */
	public static void calculateActualProfitOnSell(String qty, String avgCost, String ltp, String invested,
			int holdingDurationInMonths) {

		System.out.println("Quantity = " + qty);
		System.out.println("Average Cost = " + avgCost);
		System.out.println("Last Trade Price (LTP) = " + ltp);
		System.out.println("Invested = " + invested);

		BigDecimal actualSellingPrice = ShareMarket.calculateActualSellingPrice(ltp, qty);
		System.out.println("Actual Selling Price = " + actualSellingPrice);

		BigDecimal investedAmount = ShareMarket.getBigDecimal(invested);

		BigDecimal profit = ShareMarket.subtract(actualSellingPrice, investedAmount);
		System.out.println("Profit Before Tax = " + profit);

		BigDecimal tax = ShareMarket.calculateTax(profit, holdingDurationInMonths);
		System.out.println("Tax = " + tax);

		BigDecimal actualProfit = ShareMarket.subtract(profit, tax);
		System.out.println("Actual Profit after tax deduction = " + actualProfit);
	}
}