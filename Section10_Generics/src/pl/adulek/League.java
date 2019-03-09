package pl.adulek;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }

    public boolean addTeam(T team) {
        teams.add(team);
        return true;
    }

    public void tableTable() {
        Collections.sort(teams);
        System.out.println(name + " Tabela:");
        int i =1;
        for (T team : teams) {
            System.out.println(i+". "+ team.toString());
            i++;
        }
    }

}
