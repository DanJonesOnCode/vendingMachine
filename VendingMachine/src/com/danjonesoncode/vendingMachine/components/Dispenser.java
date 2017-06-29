package com.danjonesoncode.vendingMachine.components;

import com.danjonesoncode.vendingItems.Product;

public class Dispenser {
	int stockCount = 0;
	Product product;

	public void addNewProduct(String productName, int stock) {
		if(this.product == null) {
			this.product = new Product(productName);
			this.stockCount = stock;
		}
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
