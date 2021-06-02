package Spotify;
import Spotify.Song;
import Spotify.Playlist;
import java.util.ArrayList;
import java.io.*;

public class Library {

  // instance variables
  private String name;
  private ArrayList <Playlist> Library = new ArrayList<Playlist>();

  /** 
  * Library constructor. Creates an instance of the object for Library. 
  *
  * @param name - a string that shows the name of the playlist
  */
  public Library(String setName) {
    name = setName;
  }

  /** 
  * Getter method that returns the name of the playlist 
  * 
  * @return name
  */
  public String getName() {
    return name;
  }

  /**
  * Setter method that will give newName value
  *
  * @param newName name of the playlist
  */
  public void setName(String newName) {
    name = newName;
  }

  /** 
  * Getter method that returns the library array list 
  * 
  * @return Library array list
  */
  public ArrayList getLibrary() {
    return Library;
  }

  /**
  * Adds song to array library list
  *
  * @param newSong the name of the instance of the Song class that will be added
  */
  public ArrayList addPlaylist(Playlist newPlaylist) {
    Library.add(newPlaylist);
    return Library;
  }
  
  /**
  * Removes song from array library list
  *
  * @param song the name of the instance of the Song class that will be removed
  */
  public void removePlaylist(Playlist playlist) {

    for(int ii = 0; ii < Library.size(); ii++) {
      if(Library.get(ii).equals(playlist)) {
        Library.remove(ii);
      }
    
    }
  }  
}