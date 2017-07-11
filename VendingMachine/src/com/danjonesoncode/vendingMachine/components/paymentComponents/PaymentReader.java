package com.danjonesoncode.vendingMachine.components.paymentComponents;

public abstract class PaymentReader {
	
	int currFloat;
		
	public void updateCurrFloat(int paymentAmount) {
		currFloat += paymentAmount;
	};
	
	public int getCurrFloat() {
		return currFloat;
	};
	
	public void clearCurrFloat(){
		currFloat = 0;
	} ;
	
}
