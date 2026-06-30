package com.day3.IPL;

import java.util.ArrayList;

public class Team {

    private int teamId;
    private String teamName;
    private boolean live;
    private ArrayList<Player> players = new ArrayList<>();

    public Team(int teamId, String teamName, boolean live) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.live = live;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean isLive() {
        return live;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    @Override
    public String toString() {
        return teamId + " " + teamName + " Live : " + live;
    }
}