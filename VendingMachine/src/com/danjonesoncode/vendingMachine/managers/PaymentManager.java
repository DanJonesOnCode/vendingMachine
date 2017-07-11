package com.danjonesoncode.vendingMachine.managers;

import com.danjonesoncode.utilities.ConverterUtils;
import com.danjonesoncode.vendingMachine.components.stockComponents.Dispenser;
import com.danjonesoncode.vendingMachine.components.paymentComponents.*;

public class PaymentManager {
	String paymentMethod;
	static PaymentManager pm;
	
	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentType) {
		this.paymentMethod = paymentType;
	}
	
	
	public PaymentReader getPaymentReader() {
	
		switch (paymentMethod) {
		
		case "CASH":
			return new CoinReader();
			
		case "CARD":
			return new CardReader();
		
		default: 
			return null;
		
		}
	}	
}
