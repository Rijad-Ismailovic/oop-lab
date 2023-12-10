package task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Sve jos misire sa nju", "Parni Valjak", "exyu"));
        playlist.add(new Song("Headlines", "Drake", "rap"));
        playlist.add(new Song("Dollaz On My Head", "Gunna", "rap"));
        playlist.add(new Song("Tisina", "Bajaga", "exyu"));

        GenreFilterIterator genreFilterIterator = new GenreFilterIterator(playlist, "exyu");
        while(genreFilterIterator.hasNext()){
            Song currentSong = genreFilterIterator.next();
            String artist = (currentSong.getArtist()).toString();
            String title = (currentSong.getTitle()).toString();
            String genre = (currentSong.getGenre()).toString();
            System.out.println(artist + " - " + title + "(" + genre + ")");
        }
    }
}
