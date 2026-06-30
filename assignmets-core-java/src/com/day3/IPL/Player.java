package com.day3.IPL;

public class Player {

    private int jerseyNo;
    private String playerName;
    private double bidAmount;

    public Player(int jerseyNo, String playerName, double bidAmount) {
        this.jerseyNo = jerseyNo;
        this.playerName = playerName;
        this.bidAmount = bidAmount;
    }

    public int getJerseyNo() {
        return jerseyNo;
    }

    public String getPlayerName() {
        return playerName;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    @Override
    public String toString() {
        return jerseyNo + " " + playerName + " " + bidAmount;
    }
}