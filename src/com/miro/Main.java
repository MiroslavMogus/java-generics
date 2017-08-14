package com.miro;

import sun.text.resources.cldr.om.FormatData_om;

public class Main {

    /************************************

     Example to explain
     Generics usage

     ************************************/

    public static void main(String[] args) {

        FotballPlayer joe = new FotballPlayer("Joe");
        BaseballPlayer jim = new BaseballPlayer("Jim");
        SoccerPlayer dario = new SoccerPlayer("Dario");


        Team greatTeam = new Team("Great Team");
        greatTeam.addPlayer(joe);
        greatTeam.addPlayer(jim);
        greatTeam.addPlayer(dario);

        System.out.println("We have " + greatTeam.numPlayers() + " players in " + greatTeam.getName());
    }

}
