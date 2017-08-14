package com.miro;

public class Main {

    /************************************

     Example to explain
     Generics usage

     ************************************/

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer jimi = new FootballPlayer("Jimi");
        BaseballPlayer jim = new BaseballPlayer("Jim");
        SoccerPlayer dario = new SoccerPlayer("Dario");


        /************************************

         Football game

         ************************************/


        Team<FootballPlayer> greatTeam = new Team<>("Great Team");
        greatTeam.addPlayer(joe);

        Team<FootballPlayer> anotherGreatTeam = new Team<>("Great Team");
        anotherGreatTeam.addPlayer(jimi);





        Team<SoccerPlayer> greatSoccerTeam = new Team<>("Great Soccer Team");
        greatSoccerTeam .addPlayer(dario);

        System.out.println("We have " + greatTeam.numPlayers() + " players in " + greatTeam.getName());



    }

}
