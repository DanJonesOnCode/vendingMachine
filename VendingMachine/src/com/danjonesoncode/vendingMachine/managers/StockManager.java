package com.danjonesoncode.vendingMachine.managers;

import java.util.HashMap;

import com.danjonesoncode.utilities.ConverterUtils;
import com.danjonesoncode.vendingMachine.components.stockComponents.Dispenser;

public class StockManager {
	
	private int maxItems = 0;
	private int maxPerItem = 0;
	private HashMap<String, Dispenser> dispensers;


	public StockManager(int rows, int columns, int maxPerItem) {
		// 
		this.maxItems = rows * columns;
		this.maxPerItem = maxPerItem;
		
		// row and column for the position in the vending machine
		int row = 1;
		int column = 1;
		for(int i = 0; i < this.maxItems; i++) {
			Dispenser d = new Dispenser();
			
			String key = ConverterUtils.numericToAlpha(row) + column;
			dispensers.put(key, d);
			
			if (i % columns == 0) {
				row++;
				
			}
			
			column ++;
		}
	}
	
	public int getItemPrice(String dispenserPosition) {
		return dispensers.get(dispenserPosition).getPrice();
	}
	// validations to add new item
	private boolean canAddNewItem(String dispenserPosition, int amountOfProduct) {
		if (dispensers.get(dispenserPosition) != null) {
			return false;
		}
		
		if (amountOfProduct > this.maxPerItem) {
			return false;
		}
		
		return true;
	}
	
	public void addNewItem(String dispenserPosition, String productName, int amountOfProduct, int price) {
		if(canAddNewItem(dispenserPosition, amountOfProduct)) {
			dispensers.get(dispenserPosition).addNewProduct(productName, amountOfProduct, price);
		} 

	}
	
	public int checkStock(String dispenserPosition) {
		return dispensers.get(dispenserPosition).checkStock();
		
	}
	
	public String VendItem(String dispenserPosition) {

		
		return "Success";
	}
	
}
