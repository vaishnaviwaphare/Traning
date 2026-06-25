package com.mmcoe.stock;

public class Stock {

    private int quantity = 1000;

    public void addStock(int qty) {
        quantity += qty;
    }

    public void removeStock(int qty) {
        quantity -= qty;
    }

    public int getQuantity() {
        return quantity;
    }
}