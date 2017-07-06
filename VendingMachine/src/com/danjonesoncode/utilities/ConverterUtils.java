package com.danjonesoncode.utilities;

public class ConverterUtils {
	public static String numericToAlpha(int i) {
		
		if(i > 0 && i < 27) {
			return String.valueOf((char) i + 64);
		}
		
		return null;
	}
	
	public static double intToCurrency(int i) {
		return i % 100;
	}
	
	public static int currencyToInt(double f) {
		return (int) Math.floor(f * 100);
	}

}

