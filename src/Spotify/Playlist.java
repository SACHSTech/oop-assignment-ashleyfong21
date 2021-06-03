package Spotify;
import java.io.*;
import java.util.ArrayList;
import Spotify.Library;
import Spotify.Album;
import Spotify.Playlist;

public class Playlist extends Library {

  // instance variable
  private ArrayList <Song> Playlist = new ArrayList<Song>();

  /** 
  * Playlist constructor. Creates an instance of the object for Playlist. 
  *
  * @param setName - a string that shows the name of the playlist
  */
  public Playlist(String setName) {
    super(setName);
  }

  /** 
  * Gettor method that returns getName() 
  *
  * @return getName()
  */
  public String getName() {
    return getName();
  }

  /**
  * Setter method that will give newName value
  *
  * @param newName name of the song
  */
  public void setName(String newName) {
    super.setName(newName);
  }
  
  /** 
  * Getter method that returns the library array list 
  * 
  * @return Library array list
  */
  public ArrayList getPlaylist() {
    return getPlaylist();
  }

  /**
  * Adds song to array library list
  *
  * @param newSong the name of the instance of the Song class that will be added
  */
  public ArrayList addSong(Song newSong) {
    Playlist.add(newSong);
    return Playlist;
  }
  
  /**
  * Removes song from array library list
  *
  * @param song the name of the instance of the Song class that will be removed
  */
  public void removePlaylist(Song song) {

    for (int i = 0; i < Playlist.size(); i++) {
      if (Playlist.get(ii).equals(song)) {
        Playlist.remove(ii);
      }
    
    }
  }
  
  /** 
  * toString method that returns playlist information 
  *
  * @param getName() - a string that shows the name of the playlist
  * @param getLibrary() - an ArrayList that shows all the songs in the playlist
  */
  public String toString() {
    return super.getName() + " " + getPlaylist();
  }
}