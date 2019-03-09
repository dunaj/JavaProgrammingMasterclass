package pl.adulek;

public class Main {

    public static void main(String[] args) {
	    League<FootballTeam> Ekstraklasa = new League<>("Ekstraklasa");
	    FootballTeam pogon = new FootballTeam("Pogon Szczecin");
        FootballTeam piast = new FootballTeam ("Piast Gliwice");
        FootballTeam jaga = new FootballTeam("Jagiellonia Białystok");
        FootballTeam cracsa = new FootballTeam("Cracovia");
        pogon.playMatch(jaga, 1, 3);
        piast.playMatch(cracsa, 2, 2);
        piast.playMatch(jaga, 2, 3);
        cracsa.playMatch(pogon, 2, 1);

        Ekstraklasa.addTeam(pogon);
        Ekstraklasa.addTeam(piast);
        Ekstraklasa.addTeam(jaga);
        Ekstraklasa.addTeam(cracsa);

        Ekstraklasa.tableTable();
    }
}
