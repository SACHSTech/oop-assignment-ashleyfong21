package Spotify;
import java.io.*;
import java.util.ArrayList;
import Spotify.Song;
import Spotify.Library;

public class Playlist extends Library {

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
  * @param newName name of the playlist
  */
  public void setName(String newName) {
    super.setName(newName);
  }
  
  /** 
  * Getter method that returns the library array list 
  * 
  * @return Library array list
  */
  public ArrayList getLibrary() {
    return super.getLibrary();
  }

  /**
  * Adds song to array playlist list
  *
  * @param newSong the name of the instance of the Song class that will be added
  * @param collection the name of the instance of the Playlist class 
  */
  public ArrayList addSong(Song newSong) {
    return getName.addSong(newSong);
  }

  /**
  * Removes song from array library list
  *
  * @param song the name of the instance of the Song class that will be removed
  */
  public void removeSong(Song song) {
    getName.removeSong(song);
  }

  /** 
  * toString method that returns playlist information 
  *
  * @param getName() - a string that shows the name of the song
  * @param getLibrary() - an ArrayList that shows all the songs in the playlist
  */
  public String toString() {
    return super.getName() + " " + super.getLibrary();
  }
}