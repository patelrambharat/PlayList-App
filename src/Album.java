import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    //step 1. declare the variable
    private String artist;
    private String name;
    private List<Song> songs;
    //step 2. create the constructor
    public Album() {
    }

    public Album(String artist, String name) {
        this.artist = artist;
        this.name = name;
        this.songs = new ArrayList<>();
    }
    //step 3. create the getter and setter
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    //functionalities in the album
    //add and find song
    boolean findsong(String title){
        for(Song song : songs){
            if(song.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }
    //add song
    public String addSongToAlbum(String title , double duration){
        if(!findsong(title)){
            //I have to add the song
            Song song = new Song(title, duration);
            this.songs.add(song);
            return "song has been added to the album";
        }

        return "song already exists";
    }
    //add to playlist from album
    public String addToPlayListFromAlbum(String title, LinkedList<Song>playList){
                for(Song song : this.songs){
                    if(song.getTitle().equals(title)){
                        playList.add(song);
                        return "Song has been added to your playlist";
                    }
                }
                return "song doesn't exist in album";
    }

    //polymorphism apply here --> method overloading
    //shortcut for below line is /** after that enter
    /**
     *
     * @param songNo
     * @param playList
     * @return
     */
    public String addToPlayListFromAlbum(int songNo, LinkedList<Song>playList){
        int index = songNo -1;  //-1 because the indexing start from 0
        if(index >= 0 && index<songs.size()){
            playList.add(songs.get(index));
            return "Song has been added successfully";
        }
        return "Incorrect song number !!";
    }
}
