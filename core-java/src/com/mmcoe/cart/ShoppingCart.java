package com.mmcoe.cart;

import com.mmcoe.ds.LinkedList;

public class ShoppingCart implements Shopping {
	private LinkedList<Product> items;
	private double total;
	
	public ShoppingCart() {
		items = new LinkedList<Product>();
	}
	
	public void addToCart(Product p) throws ShoppingCartException {
		if(items.getSize() == 5)
			throw new ShoppingCartException("Your cart is full");
		else {
			items.add(p);
			total += p.getPrice();
		}
	}
	
	public void checkout() throws ShoppingCartException {
		if(items.getSize() == 0)
			throw new ShoppingCartException("Your cart is empty!");
		
		items.print();
		System.out.println("Cart Total: " + total);
	}
}
