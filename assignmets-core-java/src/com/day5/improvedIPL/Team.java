package com.day5.improvedIPL;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private int teamId;
    private String teamName;
    private List<Player> players;

    public Team() {
        players = new ArrayList<>();
    }

    public Team(int teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public String toString() {
        return "Team [teamId=" + teamId + ", teamName=" + teamName + "]";
    }

}