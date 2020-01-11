package com.sailotech.util;

public class TestUtil {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 5;

	public static Double getValueFromString(String amount) {
		String processedAmount = amount.replaceAll("[₹ ,]*", "");

		Double amountValue = Double.parseDouble(processedAmount);
		return amountValue;

	}
}
