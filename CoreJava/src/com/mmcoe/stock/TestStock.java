package com.mmcoe.stock;

public class TestStock {

    public static void main(String[] args) {

        Holder h1 = new Holder("Vaishnavi");
        Broker b1 = new Broker();
        Exchange ex = new Exchange();

        ex.displayStock();

        h1.buyStock(100);
        ex.displayStock();

        b1.sellStock(50);
        ex.displayStock();
    }
}