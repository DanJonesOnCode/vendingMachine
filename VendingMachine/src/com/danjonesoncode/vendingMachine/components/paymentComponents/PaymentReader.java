package com.danjonesoncode.vendingMachine.components.paymentComponents;

abstract class PaymentReader {
	
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
