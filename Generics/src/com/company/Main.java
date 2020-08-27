package com.company;

import javax.imageio.ImageTranscoder;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    //does not use Generics
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        //This would cause an error if you passed an String
        //items.add("Anant");
        //printDoubled(items);

        //Creating our own Generic Classes
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numbPlayers());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Manchester United");
        soccerPlayerTeam.addPlayer(beckham);

        Team<SoccerPlayer> chelsea = new Team<>("Chelsea");
        SoccerPlayer guido = new SoccerPlayer("Guido");
        chelsea.addPlayer(guido);

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        SoccerPlayer salah = new SoccerPlayer("Salah");
        liverpool.addPlayer(salah);

        soccerPlayerTeam.matchResult(chelsea, 1, 2);
        soccerPlayerTeam.matchResult(liverpool, 2,2);

        chelsea.matchResult(soccerPlayerTeam, 1,1);
        chelsea.matchResult(liverpool, 1,2);

        liverpool.matchResult(chelsea, 3,2);
        liverpool.matchResult(soccerPlayerTeam, 2,0);

        System.out.println(soccerPlayerTeam.getName() + ": " + soccerPlayerTeam.ranking());
        System.out.println(chelsea.getName() + ": " + chelsea.ranking());
        System.out.println(liverpool.getName() + ": " + liverpool.ranking());

        System.out.println(soccerPlayerTeam.compareTo(chelsea));
        System.out.println(soccerPlayerTeam.compareTo(liverpool));
        System.out.println(chelsea.compareTo(soccerPlayerTeam));
        System.out.println(chelsea.compareTo(liverpool));
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) {
            System.out.println( i * 2);
        }
    }
}
