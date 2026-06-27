package com.mmcoe.stock;

public final class StockSingleton {
	private StockSingleton() {
	}

	private static Stock stk;
	
	public static Stock getStock() {
		if(stk == null)
			stk = new Stock();
		
		return stk;
	}
}
