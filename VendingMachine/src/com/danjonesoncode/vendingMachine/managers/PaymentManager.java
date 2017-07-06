package com.danjonesoncode.vendingMachine.managers;

import com.danjonesoncode.utilities.ConverterUtils;
import com.danjonesoncode.vendingMachine.components.stockComponents.Dispenser;
import com.danjonesoncode.vendingMachine.components.paymentComponents.*;

public class PaymentManager {
	String paymentMethod;
	static PaymentManager pm;
	int currFloat = 0;
	
	String getPaymentMethod() {
		return paymentMethod;
	}
	
	public static PaymentManager getPaymentManager() {
		if(pm == null) {
			pm = new PaymentManager();
		}
		
		return pm;
	}
	
	public PaymentReader getPaymentReader() {
		switch (paymentMethod.toUpperCase()) {
		
		case "CASH":
			return new CoinReader();
			
		case "CARD":
			return new CardReader();
		
		default: 
			return null;
		
		}
	}
}
