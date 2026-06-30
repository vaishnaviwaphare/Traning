package com.day3.IPL;

public interface IPLOperation {

    void addTeam(Team t);

    void addPlayer(int teamId, Player p) throws Exception;

    Team findTeam(int teamId) throws Exception;

    Player findPlayer(int jerseyNo) throws Exception;

    double totalBid(int teamId) throws Exception;

}