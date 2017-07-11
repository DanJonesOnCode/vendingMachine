package com.danjonesoncode.vendingMachine.components.paymentComponents;

import com.danjonesoncode.vendingMachine.components.Constants;

public class CoinReader extends PaymentReader {
	
	public void clearCurrFloat() {
		super.clearCurrFloat();
	}
	
	public int getCurrFloat() {
		return super.getCurrFloat();
	}
	
	public void updateCurrFloat(int paymentAmount) {
		for(int coin : Constants.GBP_CURRENCY_DENOMINATIONS) {
			if(paymentAmount == coin) {
				super.updateCurrFloat(paymentAmount);
			}
		}
	}
}
