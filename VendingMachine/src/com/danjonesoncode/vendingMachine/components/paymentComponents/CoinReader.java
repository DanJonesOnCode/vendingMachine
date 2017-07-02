package com.danjonesoncode.vendingMachine.components.paymentComponents;

import com.danjonesoncode.vendingMachine.components.Constants;

public class CoinReader extends PaymentReader {
	
	void clearCurrFloat() {
		super.clearCurrFloat();
	}
	
	int getCurrFloat() {
		return super.getCurrFloat();
	}
	
	void updateCurrFloat(int paymentAmount) {
		super.updateCurrFloat(paymentAmount);
	}
}
