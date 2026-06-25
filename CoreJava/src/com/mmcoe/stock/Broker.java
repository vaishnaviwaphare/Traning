package com.mmcoe.stock;

public class Broker {

    public void sellStock(int qty) {
        StockSingleton.getStock().removeStock(qty);
        System.out.println("Broker sold " + qty + " shares");
    }
}