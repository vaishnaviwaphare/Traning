package com.day3;

public class Player {

    private String playerName;
    private String teamName;
    private double bid;

    public Player(String playerName, String teamName, double bid) {
        this.playerName = playerName;
        this.teamName = teamName;
        this.bid = bid;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void displayPlayer() {
        System.out.println("\n===== Player Details =====");
        System.out.println("Player Name : " + playerName);
        System.out.println("Team Name   : " + teamName);
        System.out.println("Bid Amount  : ₹" + bid + " Cr");
    }
}