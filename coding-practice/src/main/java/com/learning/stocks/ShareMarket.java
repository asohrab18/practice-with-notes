package com.learning.stocks;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ShareMarket {

	private static final BigDecimal HUNDRED = new BigDecimal("100");

	private static final BigDecimal STT_PERCENT = new BigDecimal("0.1");

	private static final BigDecimal STAMP_DUTY_PERCENT = new BigDecimal("0.015");

	private static final BigDecimal EXCHANGE_SEBI_PERCENT = new BigDecimal("0.0035");

	private static final BigDecimal GST_PERCENT = new BigDecimal("18");

	public static BigDecimal getStt(BigDecimal amount) {
		return calculatePercentage(amount, STT_PERCENT);
	}

	public static BigDecimal getStampDuty(BigDecimal amount) {
		return calculatePercentage(amount, STAMP_DUTY_PERCENT);
	}

	public static BigDecimal getExchangeAndSebiCharges(BigDecimal amount) {
		return calculatePercentage(amount, EXCHANGE_SEBI_PERCENT);
	}

	public static BigDecimal getGst(BigDecimal amount) {
		return calculatePercentage(amount, GST_PERCENT);
	}

	public static BigDecimal getFinalBuyingCharges(BigDecimal amount) {

		BigDecimal sttAndExchangeCharges = getSttAndExchangeCharges(amount);

		BigDecimal stampDuty = getStampDuty(amount);

		BigDecimal totalCharges = add(stampDuty, sttAndExchangeCharges);

		BigDecimal gst = getGst(totalCharges);

		BigDecimal finalBuyingCharges = add(totalCharges, gst);

		return setScale(finalBuyingCharges);
	}

	public static BigDecimal getFinalSellingCharges(BigDecimal amount) {

		BigDecimal sttAndExchangeCharges = getSttAndExchangeCharges(amount);

		BigDecimal gst = getGst(sttAndExchangeCharges);

		BigDecimal finalSellingCharges = add(sttAndExchangeCharges, gst);

		return setScale(finalSellingCharges);
	}

	public static BigDecimal add(BigDecimal value1, BigDecimal value2) {
		return value1.add(value2);
	}

	public static BigDecimal multiply(BigDecimal value1, BigDecimal value2) {
		return value1.multiply(value2);
	}

	public static BigDecimal subtract(BigDecimal value1, BigDecimal value2) {
		return value1.subtract(value2);
	}

	/** Helping methods */
	private static BigDecimal calculatePercentage(BigDecimal amount, BigDecimal percentage) {

		return amount.multiply(percentage).divide(HUNDRED, 6, RoundingMode.HALF_UP);
	}

	private static BigDecimal getSttAndExchangeCharges(BigDecimal amount) {
		BigDecimal stt = getStt(amount);
		BigDecimal exchangeAndSebiCharges = getExchangeAndSebiCharges(amount);
		BigDecimal sttAndExchangeCharges = add(stt, exchangeAndSebiCharges);

		return sttAndExchangeCharges;
	}

	private static BigDecimal setScale(BigDecimal value) {
		return value.setScale(2, RoundingMode.HALF_UP);
	}

	public static BigDecimal getFinalBuyingCost(BigDecimal amount, BigDecimal quantity) {
		BigDecimal amountOfTotalShares = multiply(amount, quantity);
		System.out.println("Amount of total shares = " + amountOfTotalShares);

		BigDecimal finalBuyingCharges = getFinalBuyingCharges(amountOfTotalShares);
		System.out.println("Total Buying Charges including GST = " + finalBuyingCharges);

		BigDecimal finalBuyingCost = add(amountOfTotalShares, finalBuyingCharges);

		return finalBuyingCost;
	}

	public static BigDecimal getFinalSellingValue(BigDecimal amount, BigDecimal quantity) {
		BigDecimal sellValueOfTotalShares = multiply(amount, quantity);

		System.out.println("Sell Value of total shares = " + sellValueOfTotalShares);

		BigDecimal finalSellingCharges = getFinalSellingCharges(sellValueOfTotalShares);
		System.out.println("Total Selling Charges including GST = " + finalSellingCharges);

		BigDecimal finalSellValueOfTotalShares = subtract(sellValueOfTotalShares, finalSellingCharges);
		return finalSellValueOfTotalShares;
	}

}