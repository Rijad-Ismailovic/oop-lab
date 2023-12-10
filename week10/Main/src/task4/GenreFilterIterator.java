package task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenreFilterIterator implements Iterator<Song>{
    private ArrayList<Song> playlist = new ArrayList<>();
    private String genre;
    private int index;

    public GenreFilterIterator(ArrayList playlist, String genre) {
        this.playlist = playlist;
        this.genre = genre;
        this.index = 0;
    }

    @Override
    public boolean hasNext(){
        while(this.index < playlist.size()){
            if(playlist.get(this.index).getGenre().equals(this.genre)){
                return true;
            }
            this.index++;
        }
        return false;
    }

    @Override
    public Song next(){
        if(hasNext()){
            return this.playlist.get(index++);
        } else{
            throw new NoSuchElementException();
        }
    }
}
