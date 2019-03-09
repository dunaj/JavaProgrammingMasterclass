package pl.adulek;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Winamp winamp;
    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        winamp = new Winamp();
        Album K441 = new Album("W 63 Minuty dookola swiata");
        K441.addSong("Zakon Marii" , 344);
        K441.addSong("Plus i Minus" , 343);
        K441.addSong("Psychodela" , 500);
        Album K442 = new Album("Ulamek Tarcia");
        K441.addSong("Jeden" , 344);
        K441.addSong("Intro" , 343);
        K441.addSong("Outro" , 500);
        winamp.addAlbum(K441);
        winamp.addAlbum(K442);

        winamp.addToPlaylist("Jeden");
        winamp.addToPlaylist("Zakon Marii");
        winamp.addToPlaylist("Plus i Minus");
        winamp.addToPlaylist("Intro");
        winamp.addToPlaylist("Outro");

        playingMusic();


    }

    private static void playingMusic() {
        boolean resume = true;
        winamp.startPlaying();
        tldr();
        while(resume) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    resume = false;
                    scanner.close();
                    break;
                case 1:
                    tldr();
                    break;
                case 2:
                    winamp.skipForward();
                    break;
                case 3:
                    winamp.skipBackward();
                    break;
                case 4:
                    winamp.replay();
                    break;
            }

        }
    }

    private static void tldr() {
        System.out.println("Possible actions: \n" +
                "0.Quit\n 1.Tldr \n 2. Skip Forward\n 3.Skip Backward \n 4.Replay");
    }
}
