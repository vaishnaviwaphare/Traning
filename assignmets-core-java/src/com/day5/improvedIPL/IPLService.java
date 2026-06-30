package com.day5.improvedIPL;

public interface IPLService {

    void loadPlayers();

    void addPlayer(Player p);

    void searchPlayer(String name);

    void searchTeam(String team);

    void searchRole(String role);

}