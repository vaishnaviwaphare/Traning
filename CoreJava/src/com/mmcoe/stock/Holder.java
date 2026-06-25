package com.mmcoe.stock;

public class Holder {

    private String name;

    public Holder(String name) {
        this.name = name;
    }

    public void buyStock(int qty) {
        StockSingleton.getStock().addStock(qty);
        System.out.println(name + " bought " + qty + " shares");
    }
}