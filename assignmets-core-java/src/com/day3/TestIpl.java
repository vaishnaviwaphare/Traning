package com.day3;

import java.util.Scanner;

public class TestIpl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Player[] mi = {
                new Player("Rohit Sharma", "Mumbai Indians", 16.30),
                new Player("Hardik Pandya", "Mumbai Indians", 16.35),
                new Player("Jasprit Bumrah", "Mumbai Indians", 18.00)
        };

        Player[] csk = {
                new Player("MS Dhoni", "Chennai Super Kings", 4.00),
                new Player("Ruturaj Gaikwad", "Chennai Super Kings", 18.00),
                new Player("Ravindra Jadeja", "Chennai Super Kings", 18.00)
        };

        Player[] rcb = {
                new Player("Virat Kohli", "Royal Challengers Bengaluru", 21.00),
                new Player("Rajat Patidar", "Royal Challengers Bengaluru", 11.00),
                new Player("Josh Hazlewood", "Royal Challengers Bengaluru", 12.50)
        };

        Team[] teams = {
                new Team("Mumbai Indians", mi),
                new Team("Chennai Super Kings", csk),
                new Team("Royal Challengers Bengaluru", rcb)
        };

        System.out.println("===== IPL Teams =====");

        for (int i = 0; i < teams.length; i++) {
            System.out.println((i + 1) + ". " + teams[i].getTeamName());
        }

        System.out.print("\nSelect Team : ");
        int team = sc.nextInt();

        Team selectedTeam = teams[team - 1];

        selectedTeam.displayPlayers();

        System.out.print("\nSelect Player : ");
        int player = sc.nextInt();

        Player selectedPlayer = selectedTeam.getPlayers()[player - 1];

        selectedPlayer.displayPlayer();

        sc.close();
    }
}