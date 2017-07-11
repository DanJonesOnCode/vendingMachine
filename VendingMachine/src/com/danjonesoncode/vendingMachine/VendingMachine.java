package com.danjonesoncode.vendingMachine.vendingMachine;

import com.danjonesoncode.vendingMachine.managers.StockManager.*;
import com.danjonesoncode.vendingMachine.managers.PaymentManager.*;

public class VendingMachine {
	
	StockManager sm;
	PaymentManager pm;
	private static VendingMachine vm;

	public VendingMachine getVendingMachine() {
		if (vm == null) {
			vm = new VendingMachine();
		}

		return vm;
	}
	
	private VendingMachine(int numOfRows, int numOfCols, int stockAmount) {
		sm = StockManager.getStockManager();
		pm = PaymentManager.getPaymentManager();
	}

	public void addNewItem(String vendingPosition, String producyName, int amountOfStock, int price) {
		sm.addNewItem(vendingPosition, producyName, amountOfStock, price);
	}

	public void selectPaymentType(String paymentType) {
		pm.setPaymentType(paymentType);
	}

	public void addPaymentAmount(double paymentAmount) {
		pm.getPaymentReader().updateCurrFloat(paymentAmount);
	}

	public void vendItem(String itemPosition) {

		if(sm.getPrice())

	}



}
