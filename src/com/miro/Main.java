package com.miro;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    /************************************

     Example to explain
     Generics usage

     ************************************/

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer jacky = new FootballPlayer("Jacky");
        FootballPlayer jimi = new FootballPlayer("Jimi");
        BaseballPlayer jim = new BaseballPlayer("Jim");
        SoccerPlayer dario = new SoccerPlayer("Dario");


        /************************************

         Football game

         ************************************/

        Team<FootballPlayer> simpleTeam = new Team<>("Simple Team");
        simpleTeam.addPlayer(jacky);

        Team<FootballPlayer> greatTeam = new Team<>("Great Team");
        greatTeam.addPlayer(joe);

        Team<FootballPlayer> anotherGreatTeam = new Team<>("Another Great Team");
        anotherGreatTeam.addPlayer(jimi);

        greatTeam.matchResult(anotherGreatTeam, 2, 0);
        greatTeam.matchResult(simpleTeam, 3, 1);

        simpleTeam.matchResult(anotherGreatTeam, 2,2);


        Team<SoccerPlayer> greatSoccerTeam = new Team<>("Great Soccer Team");
        greatSoccerTeam.addPlayer(dario);

        System.out.println("We have " + greatTeam.numPlayers() + " players in " + greatTeam.getName());


        System.out.println("Rankings");

        System.out.println(simpleTeam.getName() + " : " + simpleTeam.ranking());

        System.out.println(anotherGreatTeam.getName() + " : " + anotherGreatTeam.ranking());

        System.out.println(greatTeam.getName() + " : " + greatTeam.ranking());

        System.out.println("Comparison");

        System.out.println(simpleTeam.compareTo(greatTeam));

        System.out.println(simpleTeam.compareTo(anotherGreatTeam));

        System.out.println(greatTeam.compareTo(anotherGreatTeam));

        League<Team<FootballPlayer>> croleague = new League<>("First Croatian Football League");

        croleague.addTeam(greatTeam);

        croleague.addTeam(anotherGreatTeam);

        croleague.printAllTeams();

    }

}
