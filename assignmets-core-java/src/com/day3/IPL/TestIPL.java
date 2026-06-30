package com.day3.IPL;

public class TestIPL {

    public static void main(String[] args) {

    	IPLmpl obj = new IPLmpl();

        obj.addTeam(new Team(1, "CSK", true));
        obj.addTeam(new Team(2, "MI", true));
        obj.addTeam(new Team(3, "RCB", false));
        obj.addTeam(new Team(4, "KKR", true));
        obj.addTeam(new Team(5, "SRH", true));

        try {

            obj.addPlayer(1, new Player(7, "Dhoni", 18.5));
            obj.addPlayer(1, new Player(8, "Jadeja", 16.2));

            obj.addPlayer(2, new Player(45, "Rohit", 16.3));

            obj.addPlayer(3, new Player(18, "Virat", 20.0)); // Exception

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(obj.findTeam(1));
            System.out.println(obj.findPlayer(7));
            System.out.println("Total Bid = " + obj.totalBid(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}