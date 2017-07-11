package com.danjonesoncode.vendingMachine.api;

import com.danjonesoncode.utilities.ConverterUtils;
import com.danjonesoncode.vendingMachine.VendingMachine;

public class VendingMachineAPI {
	
	private VendingMachine vm;
	
	public VendingMachine createVendingMachine(int rows, int columns, int MaxItemsPerDispenser) {
		
		return vm = new VendingMachine(rows, columns, MaxItemsPerDispenser);
	}
	
	// Methods for selecting, paying for and vending an item
	public void MakeSelection(String itemSelection) {
		vm.setItemPosition(itemSelection);
	}
	
	public void payByCard(double payment) {
		vm.selectPaymentType("CARD");
		vm.addPaymentAmount(payment);
	}
	
	public void payByCoin(double[] payment) {
		vm.selectPaymentType("CASH");
		for(double coin : payment) {
			vm.addPaymentAmount(coin);
		}
	}

	public void vendSelectedItem() {
		vm.vendItem();
	}
	
	// Methods to stock the vending machine
	public void addNewItem(String itemPosition, String productName, int amountOfStock, double price) {
		vm.addNewItem(itemPosition, productName, amountOfStock, ConverterUtils.currencyToInt(price));
	}
	
}
