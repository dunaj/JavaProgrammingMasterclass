package pl.adulek;

import java.util.LinkedList;

public class Album {
    private String title;
    private LinkedList<Song> songs;

    public Album() {
        this.songs = new LinkedList<>();
    }

    public Album(String title) {
        this.title = title;
        this.songs = new LinkedList<>();
    }

    public String getTitle() {
        return title;
    }

    public Album(LinkedList<Song> songs) {
        this.songs = songs;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title)) {
            System.out.println("There is already song with title " + title +" on the album");
            return false;
        } else {
            songs.add(new Song(title, duration));
            return true;
        }
    }

    private boolean findSong(String title) {
        for(Song s : songs) {
            if (s.getTitle().equals(title))
                    return true;
        }
        return false;
    }
}
