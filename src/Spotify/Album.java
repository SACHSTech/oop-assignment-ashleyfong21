package Spotify;
import java.io.*;
import java.util.ArrayList;
import Spotify.Song;
import Spotify.Library;

public class Album extends Library {

  // instance variables
  private String artist;
  private int tracks; 
  private ArrayList<Song> Library = new ArrayList<Song>();
  private ArrayList<Song> Album = new ArrayList<Song>();

  /** 
  * Albums constructor. Creates an instance of the object for Albums. 
  *
  * @param setName - a string that shows the name of the song
  * @param artist - a string that shows the artist of the song
  */
  public Album (String setName, String newArtist, int numTracks) {
    super(setName);
    artist = newArtist;
    tracks = numTracks; 
  }

  /** 
  * Gettor method that returns getName() 
  *
  * @return getName()
  */
  public String getName() {
    return super.getName();
  }

  /** 
  * Gettor method that returns the artist 
  *
  * @return the artist
  */
  public String getArtist() {
    return artist;
  }

  /** 
  * Getter method that returns the number of tracks on the album 
  *
  * @return the artist
  */
  public int getTracks() {
    return tracks;
  }

  /**
  * Adds song to array library list
  *
  * @param newSong the name of the instance of the Song class that will be added
  */
  public ArrayList addSong(Song newSong) {
    Album = Album.addSong(newSong);
    return Album;
  }

  /** 
  * Gettor method that returns the library array list
  *
  * @return library list
  */
  public ArrayList getAlbum() {
    return Album;
  }

  /** 
  * toString method that returns album information 
  *
  * @param getName() - a string that shows the name of the song
  * @param getArtist() - a string that shows the artist of the song
  * @param Library - an ArrayList that shows all the songs in the album
  */
  public String toString() {
    return super.getName() + " by " + artist + " has " + tracks + " number of tracks: " + Album;
  }
}