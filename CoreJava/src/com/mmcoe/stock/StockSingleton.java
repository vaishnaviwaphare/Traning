package com.mmcoe.stock;

public class StockSingleton {

    private static Stock stock = new Stock();

    public static Stock getStock() {
        return stock;
    }
}

//public final class StockSingleton{
//	private StockSingleton() {
//		
//	}
//	
//	private static Stock stk;
//
//	public static Stock getStk() {
//		if(stk==null) {
//			stk=new Stock();
//		}
//		
//		return stk;
//	}
//
//	
//}