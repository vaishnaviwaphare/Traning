package com.mmcoe.cart;

public interface Shopping {
	void addToCart(Product p) throws ShoppingCartException;
	void checkout() throws ShoppingCartException;
}
