package com.learning.stocks;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ShareMarket {

	private static final BigDecimal HUNDRED = new BigDecimal("100");

	private static final BigDecimal STT_PERCENT = new BigDecimal("0.1");

	private static final BigDecimal STAMP_DUTY_PERCENT = new BigDecimal("0.015");

	private static final BigDecimal EXCHANGE_SEBI_PERCENT = new BigDecimal("0.0035");

	private static final BigDecimal GST_PERCENT = new BigDecimal("18");

	private static final BigDecimal STCG_PERCENT = new BigDecimal("20");

	/**
	 * When I buy some shares then I have to pay (price + some charges and 18% GST)
	 * as applicable.
	 */
	public static void calculateTotalCostIncludingChargesAndGstOnBuying(String price, String qty) {
		BigDecimal oneSharePrice = getBigDecimal(price);
		BigDecimal quantity = getBigDecimal(qty);
		BigDecimal totalPrice = multiply(oneSharePrice, quantity);

		BigDecimal chargesIncludingGstOnBuying = getChargesIncludingGstOnBuying(totalPrice);

		BigDecimal totalCostIncludingChargesAndGstOnBuying = add(totalPrice, chargesIncludingGstOnBuying);
		System.out.println("Current price of a new share = " + oneSharePrice);
		System.out.println("Quantity to be ordered = " + quantity);
		System.out.println("Total Price = (Current price * Quantity) = " + totalPrice);
		System.out.println("Charges + GST = " + chargesIncludingGstOnBuying);
		System.out
				.println("Total Cost including charges and GST on buying = " + totalCostIncludingChargesAndGstOnBuying);
	}

	/**
	 * When I sell my shares then actual selling price = LTP - some deductions of
	 * charges, GST as applicable.
	 */
	public static BigDecimal calculateActualSellingPrice(String ltp, String qty) {
		BigDecimal lastTradePrice = getBigDecimal(ltp);
		BigDecimal quantity = getBigDecimal(qty);
		BigDecimal totalPrice = multiply(lastTradePrice, quantity);

		BigDecimal chargesIncludingGstOnSelling = getChargesIncludingGstOnSelling(totalPrice);

		BigDecimal actualSellingPrice = subtract(totalPrice, chargesIncludingGstOnSelling);
		System.out.println("Last Traded Price (LTP) of a share = " + lastTradePrice);
		System.out.println("Quantity for selling = " + quantity);
		System.out.println("Total Price = (LTP * Quantity) = " + totalPrice);
		System.out.println("Charges including GST = " + chargesIncludingGstOnSelling);
		System.out.println("Actual Selling Price = (Total Price - Charges including GST) = " + actualSellingPrice);

		return actualSellingPrice;
	}

	/**
	 * Helping methods
	 */
	private static BigDecimal getChargesIncludingGstOnBuying(BigDecimal amount) {

		BigDecimal stt = getStt(amount);
		BigDecimal stampDuty = getStampDuty(amount);
		BigDecimal exchangeAndSebiCharges = getExchangeAndSebiCharges(amount);
		BigDecimal gst = getGst(exchangeAndSebiCharges);

		BigDecimal chargesIncludingGstOnBuying = stt.add(stampDuty).add(exchangeAndSebiCharges).add(gst);

		return setScale(chargesIncludingGstOnBuying);
	}

	private static BigDecimal getChargesIncludingGstOnSelling(BigDecimal amount) {

		BigDecimal stt = getStt(amount);
		BigDecimal exchangeAndSebiCharges = getExchangeAndSebiCharges(amount);
		BigDecimal gst = getGst(exchangeAndSebiCharges);

		BigDecimal chargesIncludingGstOnSelling = stt.add(exchangeAndSebiCharges).add(gst);

		return setScale(chargesIncludingGstOnSelling);
	}

	private static BigDecimal getStt(BigDecimal amount) {
		return getPercentOfAmount(amount, STT_PERCENT);
	}

	private static BigDecimal getStampDuty(BigDecimal amount) {
		return getPercentOfAmount(amount, STAMP_DUTY_PERCENT);
	}

	private static BigDecimal getExchangeAndSebiCharges(BigDecimal amount) {
		return getPercentOfAmount(amount, EXCHANGE_SEBI_PERCENT);
	}

	private static BigDecimal getGst(BigDecimal amount) {
		return getPercentOfAmount(amount, GST_PERCENT);
	}

	/** If holding Duration < 12 Months then Tax = 20% (STCG) */
	public static BigDecimal calculateTax(BigDecimal profit, int holdingDurationInMonths) {
		System.out.println("Holding duration = " + holdingDurationInMonths + " month(s)");
		if (profit.compareTo(BigDecimal.ZERO) <= 0) {
			return BigDecimal.ZERO;
		}

		if (holdingDurationInMonths < 12) {
			return getPercentOfAmount(profit, STCG_PERCENT);
		}
	    // LTCG logic can be added later

		return BigDecimal.ZERO;
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

	public static BigDecimal getBigDecimal(String value) {
		return new BigDecimal(value);
	}

	private static BigDecimal getPercentOfAmount(BigDecimal amount, BigDecimal percentage) {
		BigDecimal value = amount.multiply(percentage).divide(HUNDRED);
		return setScale(value);
	}

	private static BigDecimal setScale(BigDecimal value) {
		return value.setScale(2, RoundingMode.HALF_UP);
	}
}