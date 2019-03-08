package pl.adulek;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Winamp {
    private ArrayList<Album> albums;
    private LinkedList<Song> playlist;
    private boolean skippingForward;
    private ListIterator<Song> currentSong;

    public Winamp() {
        albums = new ArrayList<>();
        playlist = new LinkedList<Song>();
        skippingForward = true;
        //currentSong = playlist.listIterator();
    }

    public void addAlbum(Album a) {
        this.albums.add(a);
    }

    public void addToPlaylist(String title) {
        Song s = findSongInAlbums(title);
        if (s != null)
            this.playlist.add(s);
        else {
            System.out.println("Cannot add non-existing song to the playlist");
        }
    }

    public boolean addSongToAlbum(String albumName, String songName, double duration) {
        Album a = findAlbum(albumName);
        if (a == null ) {
            System.out.println("No such album");
            return false;
        } else {
            return a.addSong(songName, duration);
        }
    }

    public Song findSongInAlbums(String title) {
        for (Album a: albums) {
            LinkedList<Song> list = a.getSongs();
            for (Song s: list) {
                if(s.getTitle().equals(title))
                    return s;
            }
        }
        return null;
    }

    public Album findAlbum(String albumName) {
        for(Album a  : albums) {
            if (a.getTitle().equals(albumName))
                return a;
        }
        return null;
    }

    public boolean startPlaying() {
        currentSong = playlist.listIterator();
        if (currentSong.hasNext()) {
            System.out.println("Now playing "+ currentSong.next());
            skippingForward = true;
            return true;
        }
        System.out.println("Empty playlist");
        return false;

    }

    public boolean skipForward() {
        if(!skippingForward) {
            if (currentSong.hasNext()) {
                currentSong.next();
            }
            skippingForward = true;
        }
        if (currentSong.hasNext()) {
            System.out.println("Now playing "+ currentSong.next());
            return true;
        } else {
            System.out.println("Reach the playlist end. Cannot skip");
            return false;
        }
    }

    public boolean skipBackward() {
        if(skippingForward) {
            if (currentSong.hasPrevious()) {
                currentSong.previous();
            }
            skippingForward = false;
        }
        if (currentSong.hasPrevious()) {
            System.out.println("Now playing "+ currentSong.previous());
            return true;
        } else {
            System.out.println("Reach the playlist begin. Cannot skip");
            return false;
        }
    }

    public void replay() {
        if(skippingForward) {
            if(currentSong.hasPrevious()) {
                System.out.println("Now replaying "+ currentSong.previous());
                skippingForward = false;
            } else {
                System.out.println("Shouldnt reach here!");
            }
        } else {
            if (currentSong.hasNext()) {
                System.out.println("Now replaying "+ currentSong.next());
                skippingForward = true;
            } else {
                System.out.println("Shouldnt reach here!");
            }
        }
    }
}
