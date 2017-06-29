package com.danjonesoncode.vendingMachine.managers;

import java.util.HashMap;
import com.danjonesoncode.vendingMachine.components.Dispenser;
import com.danjonesoncode.utilities.Utilities;

public class StockManager {
	
	private int maxItems = 0;
	private int maxPerItem = 0;
	private HashMap<String, Dispenser> dispensers;

	private StockManager(int rows, int columns, int maxPerItem) {
		// 
		this.maxItems = rows * columns;
		this.maxPerItem = maxPerItem;
		
		// row and column for the position in the vending machine
		int row = 1;
		int column = 1;
		for(int i = 0; i < this.maxItems; i++) {
			Dispenser d = new Dispenser();
			
			String key = Utilities.numericToAlpha(row) + column;
			dispensers.put(key, d);
			
			if (i % columns == 0) {
				row++;
				
			}
			
			column ++;
		}
	}
	// validations to add new item
	private boolean canAddNewItem(String dispenserPosition, int amountOfProduct) {
		if (dispensers.containsKey(dispenserPosition)) {
			return false;
		}
		
		if (amountOfProduct > this.maxPerItem) {
			return false;
		}
		
		return true;
	}
	
	public void addNewItem(String dispenserPosition, String productName, int amountOfProduct) {
		if(canAddNewItem(dispenserPosition, amountOfProduct)) {
			dispensers.get(dispenserPosition).addNewProduct(productName, amountOfProduct);
		} 

	}
	
	public int checkStock(Dispenser d) {
		return d.checkStock();
		
	}
	
	public String VendItem(Dispenser d) {
		if (checkStock(d) == 0) {
			return "Out of stock. Please make another selection";
		}
		
		return "Success";
	}
}
