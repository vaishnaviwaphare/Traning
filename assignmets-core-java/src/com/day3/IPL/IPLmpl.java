package com.day3.IPL;

import java.util.HashMap;

public class IPLmpl implements IPLOperation {

    HashMap<Integer, Team> teams = new HashMap<>();

    @Override
    public void addTeam(Team t) {
        teams.put(t.getTeamId(), t);
    }

    @Override
    public void addPlayer(int teamId, Player p) throws Exception {

        Team t = teams.get(teamId);

        if (t == null)
            throw new Exception("Team Not Found");

        if (!t.isLive())
            throw new Exception("Team Not Live");

        t.addPlayer(p);
    }

    @Override
    public Team findTeam(int teamId) throws Exception {

        Team t = teams.get(teamId);

        if (t == null)
            throw new Exception("Team Not Found");

        return t;
    }

    @Override
    public Player findPlayer(int jerseyNo) throws Exception {

        for (Team t : teams.values()) {

            for (Player p : t.getPlayers()) {

                if (p.getJerseyNo() == jerseyNo)
                    return p;
            }
        }

        throw new Exception("Player Not Found");
    }

    @Override
    public double totalBid(int teamId) throws Exception {

        Team t = findTeam(teamId);

        double total = 0;

        for (Player p : t.getPlayers()) {
            total += p.getBidAmount();
        }

        return total;
    }

}