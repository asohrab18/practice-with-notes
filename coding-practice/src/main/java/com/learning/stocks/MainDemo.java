package com.learning.stocks;

import java.math.BigDecimal;

public class MainDemo {

	public static void calculateFinalCostOnBuying() {
		System.out.println("Calculate final cost on buying:");
		System.out.println("==================================");
		String price = "185", qty = "10";
		ShareMarket.calculateTotalCostIncludingChargesAndGstOnBuying(price, qty);
	}

	public static void calculateActualProfitOrLossOnSell() {
		System.out.println("Calculate actual profit or loss on sell:");
		System.out.println("===========================================");
		String qty = "50", avgCost = "593.71", ltp = "544.70", invested = "29685.35";
		int holdingDurationInMonths = 1;
		calculateActualProfitOrLossOnSell(qty, avgCost, ltp, invested, holdingDurationInMonths);
	}

	public static void main(String[] args) {
		calculateFinalCostOnBuying();
		System.out.println(
				"\n============================================================================================");
		System.out.println(
				"============================================================================================");
		System.out.println(
				"============================================================================================\n");
		calculateActualProfitOrLossOnSell();
	}

	/**
	 * When I sell my shares then I get actual profit/loss after deductions of
	 * charges and tax as applicable.
	 */
	public static void calculateActualProfitOrLossOnSell(String qty, String avgCost, String ltp, String invested,
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
		System.out.println("Actual Profit or Loss after tax deduction = " + actualProfit);
	}
}