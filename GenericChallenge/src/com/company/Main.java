package com.company;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("Premiership");

        Team<FootballPlayer> manutd = new Team<>("Manchester United");
        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        Team<FootballPlayer> liverpool = new Team<>("Liverpool");

        footballLeague.add(manutd);
        footballLeague.add(chelsea);
        footballLeague.add(liverpool);

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");

        manutd.matchResult(chelsea, 1, 2);
        manutd.matchResult(liverpool, 2,2);

        chelsea.matchResult(manutd, 1,1);
        chelsea.matchResult(liverpool, 1,2);

        liverpool.matchResult(chelsea, 3,2);
        liverpool.matchResult(manutd, 2,0);

        footballLeague.showLeagueTable();

    }
}
