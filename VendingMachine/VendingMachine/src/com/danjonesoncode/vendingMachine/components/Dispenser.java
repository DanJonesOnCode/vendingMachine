package com.danjonesoncode.vendingMachine.components;

import com.danjonesoncode.vendingItems.*;

public class Dispenser {
	int stockCount = 0;
	Product product;

	void addNewProduct(Product p, int stock) {
		if(this.product == null) {
			this.product = p;
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
