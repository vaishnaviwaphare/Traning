package com.day5.improvedIPL;

public class TestIPL {

    public static void main(String[] args) {

        IPLService obj = new IPLServiceImpl();

        obj.loadPlayers();

        System.out.println("------ Search Team ------");
        obj.searchTeam("CSK");

        System.out.println("\n------ Search Player ------");
        obj.searchPlayer("Dhoni");

        System.out.println("\n------ Search Bowler ------");
        obj.searchRole("Bowler");

        obj.addPlayer(new Player(11, "MI", "Tilak", "Batter", 12.5));

        System.out.println("\n------ After Adding Player ------");
        obj.searchTeam("MI");

    }

}