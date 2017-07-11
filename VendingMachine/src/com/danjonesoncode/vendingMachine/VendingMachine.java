package com.danjonesoncode.vendingMachine;

import com.danjonesoncode.vendingMachine.managers.StockManager;
import com.danjonesoncode.utilities.ConverterUtils;
import com.danjonesoncode.vendingMachine.managers.PaymentManager;

public class VendingMachine {
	
	StockManager sm;
	PaymentManager pm;
	String itemPosition = "";
	
	public VendingMachine(int numOfRows, int numOfCols, int stockAmount) {
		sm = new StockManager(numOfRows, numOfCols, stockAmount);
		pm = new PaymentManager();
	}

	public void addNewItem(String vendingPosition, String producyName, int amountOfStock, int price) {
		sm.addNewItem(vendingPosition, producyName, amountOfStock, price);
	}

	public void selectPaymentType(String paymentType) {
		pm.setPaymentMethod(paymentType);
	}

	public void addPaymentAmount(double paymentAmount) {
		pm.getPaymentReader().updateCurrFloat(ConverterUtils.currencyToInt(paymentAmount));
	}

	public void vendItem() {

		if(sm.getItemPrice(this.itemPosition) <= pm.getPaymentReader().getCurrFloat()) {
			if(sm.checkStock(this.itemPosition) > 0) {
				sm.VendItem(this.itemPosition);
				
			}
		}

	}

	public void setItemPosition(String itemSelection) {
		this.itemPosition = itemSelection;
	}



}
