package com.miro;

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

        Team<FootballPlayer> anotherGreatTeam = new Team<>("Great Team");
        anotherGreatTeam.addPlayer(jimi);

        greatTeam.matchResult(anotherGreatTeam, 2, 0);
        greatTeam.matchResult(simpleTeam, 3, 1);

        simpleTeam.matchResult(anotherGreatTeam, 2,2);





        Team<SoccerPlayer> greatSoccerTeam = new Team<>("Great Soccer Team");
        greatSoccerTeam .addPlayer(dario);

        System.out.println("We have " + greatTeam.numPlayers() + " players in " + greatTeam.getName());



    }

}
