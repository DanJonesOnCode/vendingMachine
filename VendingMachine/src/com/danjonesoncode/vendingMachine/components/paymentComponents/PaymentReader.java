package com.danjonesoncode.vendingMachine.components.paymentComponents;

public abstract class PaymentReader {
	
	int currFloat;
		
	void updateCurrFloat(int paymentAmount) {
		currFloat += paymentAmount;
	};
	
	int getCurrFloat() {
		return currFloat;
	};
	
	void clearCurrFloat(){
		currFloat = 0;
	} ;
	
}
