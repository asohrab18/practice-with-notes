package com.learning.stocks;

import java.math.BigDecimal;

public class MainDemo {

	public static void main(String[] args) {
		//String price = "185", qty = "10";
		//ShareMarket.calculateTotalCostIncludingChargesAndGstOnBuying(price, qty);

		calculateActualProfitOnSell("348", "1089.41", "1234.20", "379115.40", 3);
	}

	/**
	 * When I sell my shares then I get actual profit/loss after deductions of
	 * charges and tax as applicable.
	 */
	public static void calculateActualProfitOnSell(String qty, String avgCost, String ltp, String invested,
			int holdingDurationInMonths) {

		BigDecimal actualSellingPrice = ShareMarket.calculateActualSellingPrice(ltp, qty);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Average Cost = " + avgCost);
		BigDecimal investedAmount = ShareMarket.getBigDecimal(invested);
		System.out.println("Invested Amount = (Average Cost * Quantity) = " + investedAmount);
		System.out.println("---------------------------------------------------------------------------");
		BigDecimal profitOrLoss = ShareMarket.subtract(actualSellingPrice, investedAmount);
		System.out.println("Profit or Loss = (Actual Selling Price - Invested Amount) = " + profitOrLoss);

		BigDecimal tax = ShareMarket.calculateTax(profitOrLoss, holdingDurationInMonths);
		System.out.println("Tax = " + tax);

		BigDecimal actualProfit = ShareMarket.subtract(profitOrLoss, tax);
		System.out.println("Actual Profit after tax deduction = " + actualProfit);
	}
}