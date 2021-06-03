package Spotify;
import java.io.*;
import java.util.ArrayList;
import Spotify.Library;
import Spotify.Album;
import Spotify.Playlist;

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
  * Adds playlist to library list
  *
  * @param newPlaylist the name of the instance of the Playlist class that will be added
  */
  public ArrayList addPlaylist(Playlist newPlaylist) {
    Library.add(newPlaylist);
    return Library;
  }
  
  /**
  * Removes playlist from array library list
  *
  * @param playlist the name of the instance of the playlist class that will be removed
  */
  public void removePlaylist(Playlist playlist) {

    for (int i = 0; i < Library.size(); i++) {
      if (Library.get(ii).equals(playlist)) {
        Library.remove(ii);
      }
    
    }
  }  
}