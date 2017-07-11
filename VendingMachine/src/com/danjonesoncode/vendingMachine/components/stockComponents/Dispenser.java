package com.danjonesoncode.vendingMachine.components.stockComponents;

import com.danjonesoncode.vendingMachine.vendingItems.Product;

public class Dispenser {
	int stockCount = 0;
	Product product;
	int price = 0;

	public void addNewProduct(String productName, int stock, int price) {
		// Emptying the dispenser before refilling it.
		resetDispenser();
		
		this.product = new Product(productName);
		this.stockCount = stock;
		setPrice(price);
	
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public void resetDispenser() {
		if(this.product != null) {
			this.product = null;
			this.stockCount = 0;
		}
	}
	
	public void restockDispenser(int newItemsToAdd) {
		this.stockCount += newItemsToAdd;
	}
	
	public String getProductDetails() {
		return this.product.toString();
	}
	
	public int checkStock() {
		return this.stockCount;
	}
	
	public boolean dispenseProduct() {
		if (this.stockCount == 0) {
			return false;
		}
		
		if (this.product == null) {
			return false;
		}
		
		this.stockCount --;
		return true;
	}
	
	
}
