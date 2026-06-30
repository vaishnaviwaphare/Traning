package com.day5.improvedIPL;

public class Player {

    private int id;
    private String team;
    private String name;
    private String role;
    private double amount;

    public Player(int id, String team, String name, String role, double amount) {
        this.id = id;
        this.team = team;
        this.name = name;
        this.role = role;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return id + " " + team + " " + name + " " + role + " " + amount;
    }
}