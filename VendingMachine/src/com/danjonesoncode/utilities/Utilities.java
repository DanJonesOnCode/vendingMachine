package com.danjonesoncode.utilities;

public class Utilities {
	public static String numericToAlpha(int i) {
		
		if(i > 0 && i < 27) {
			return String.valueOf((char) i + 64);
		}
		
		return null;
	}

}

