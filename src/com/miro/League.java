package com.miro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    // Add team to the league
    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + "already playing in this league");
            return false;
        } else {
            teams.add(team);
            System.out.println("Team " + team.getName() + " added to league " + this.name);
            return true;
        }
    }

    public void printAllTeams() {
        System.out.println("Listing all the teams..");

        Collections.sort(teams);

        for (int i = 0; i < teams.size(); i++)
            System.out.println(teams.get(i).getName() +" : " + teams.get(i).ranking());
    }


}




