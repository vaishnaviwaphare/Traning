package com.day5.improvedIPL;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IPLServiceImpl implements IPLService {

    private List<Player> players = new ArrayList<>();

    @Override
    public void loadPlayers() {

        try {

            Files.lines(Paths.get("ipl.csv"))
                    .map(line -> line.split(","))
                    .forEach(a -> players.add(
                            new Player(
                                    Integer.parseInt(a[0]),
                                    a[1],
                                    a[2],
                                    a[3],
                                    Double.parseDouble(a[4]))));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void addPlayer(Player p) {
        players.add(p);
    }

    @Override
    public void searchPlayer(String name) {

        players.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);

    }

    @Override
    public void searchTeam(String team) {

        players.stream()
                .filter(p -> p.getTeam().equalsIgnoreCase(team))
                .forEach(System.out::println);

    }

    @Override
    public void searchRole(String role) {

        players.stream()
                .filter(p -> p.getRole().equalsIgnoreCase(role))
                .forEach(System.out::println);

    }

}