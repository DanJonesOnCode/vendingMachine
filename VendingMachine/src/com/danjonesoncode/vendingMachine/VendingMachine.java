package com.danjonesoncode.vendingMachine.vendingMachine;

import com.danjonesoncode.vendingMachine.managers.*;

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
		pm = new PaymentManager();
	}
}
