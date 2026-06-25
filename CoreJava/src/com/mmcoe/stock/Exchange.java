package com.mmcoe.stock;

public class Exchange {

    public void displayStock() {
        System.out.println("Available Stock : "
                + StockSingleton.getStock().getQuantity());
    }
}