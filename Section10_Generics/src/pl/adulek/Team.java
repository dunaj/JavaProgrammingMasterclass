package pl.adulek;

import java.util.ArrayList;

public abstract class Team implements Comparable<Team> {
    protected String name;
    protected ArrayList<String> players;
    protected int played = 0;
    protected int won = 0;
    protected int lost = 0;
    protected int draw = 0;


    public Team(String name, ArrayList<String> players) {
        this.name = name;
        this.players = players;
    }

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPlayers() {
        return players;
    }

    public boolean addPlayer(String name) {
        for(String n : players) {
            if (n.equals(name)) {
                System.out.println("Cannot add the same player again");
                return false;
            }
        }
        players.add(name);
        return true;
    }

    public abstract void playMatch(Team t, int ourScore, int opponentScore);
    public abstract int countPoints();
    public abstract String toString();

    @Override
    public int compareTo(Team team) {
        return team.countPoints() - this.countPoints();
    }

//    @Override
//    public int compareTo(Team o) {
//        return 0;
//    }
}
