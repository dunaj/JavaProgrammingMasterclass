package pl.adulek;

import java.util.ArrayList;

public class FootballTeam extends Team {
    public FootballTeam(String name) {
        super(name);
    }

    public FootballTeam(String name, ArrayList<String> players) {
        super(name, players);
    }

    @Override
    public void playMatch(Team t, int ourScore, int opponentScore) {
        if (ourScore == opponentScore)
            this.draw++;
        else if (ourScore > opponentScore)
            this.won++;
        else
            this.lost++;
        played++;
        if(t != null) {
            t.playMatch(null, opponentScore, ourScore);
        }
    }

    @Override
    public int countPoints() {
        return (won * 3) + draw;
    }

    @Override
    public String toString() {
        return name + "\t\t" + this.countPoints() + " pts";
    }
}
