package com.mmcoe.cart;

public final class CartFactory {
	private CartFactory() {
	}

	public static Shopping newCart() {
		return new ShoppingCart();
	}
}
