package com.day3;

public class Team {

    private String teamName;
    private Player[] players;

    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void displayPlayers() {

        System.out.println("\nPlayers of " + teamName);

        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + ". " + players[i].getPlayerName());
        }
    }
}