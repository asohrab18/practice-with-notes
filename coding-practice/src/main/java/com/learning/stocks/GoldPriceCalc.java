package com.learning.stocks;

public class GoldPriceCalc {

	public static double getBillAmount(double price, int numberOfCoins) {
		double labourCharges = 2500;
		double discount = 550;
		
		double total = (price + labourCharges - discount) * numberOfCoins;
		double sgst = getGst(total);
		double cgst = getGst(total);

		return total + sgst + cgst;
	}

	public static double getGst(double total) {
		return total * 1.5 / 100;
	}

	public static void main(String[] args) {
		double gold24k10gramsCoinInrPrice = 133460;
		int numberOfCoins = 4;
		double billAmount = getBillAmount(gold24k10gramsCoinInrPrice, numberOfCoins);
		System.out.println("Final Bill Amount (INR) = " + billAmount);
	}

}
