package Spotify;
import java.io.*;
import java.util.ArrayList;
import Spotify.Library;
import Spotify.Album;
import Spotify.Playlist;

public class Song {

  // instance variables
  private String name;
  private String artist;
  private String album;
  private String release;
  private boolean liked; 

  /** 
  * Song constructor. Creates an instance of the object for Song. 
  *
  * @param theName - a string that shows the name of the song
  * @param theArtist - a string that shows the artist of the song
  * @param theAlbum - a string that shows which album the songs belongs
  * @param theRelease - a string that shows the release month of the song
  * @param isLiked - a boolean that shows if the song is liked or not 
  */

  public Song (String theName, String theArtist, String theAlbum, String theRelease, boolean isLiked) {
    name = theName;
    artist = theArtist;
    album = theAlbum;
    release = theRelease;
    liked = isLiked; 
  }

  /** 
  * Getter method that returns the name of the song 
  * 
  * @return name
  */
  public String getName() {
    return name;
  }

  /** 
  * Getter method that returns the artist 
  * 
  * @return artist
  */
  public String getArtist() {
    return artist;
  }

  /** 
  * Getter method that returns the album 
  * 
  * @return album
  */
  public String getAlbum() {
    return album;
  }

  /** 
  * Getter method that returns the release year 
  * 
  * @return release
  */
  public String getRelease() {
    return release;
  }

  /** 
  * Getter method that returns if it is liked or not
  * 
  * @return liked
  */
  public boolean getLiked() {
    return liked;
  }
  
  /** 
  * toString method that returns song information 
  *
  * @param getName() - a string that shows the name of the song
  * @param getArtist() - a string that shows the artist of the song
  * @param getAlbum() - a string that shows which album the songs belongs
  * @param getRelease() - a string that shows the release month of the song
  * @param isLiked() - a boolean that indicates if the song is liked
  */
  public String toString() {
    return getName() + " by " + getArtist() + " released in " + getRelease() + ", is in the album " + getAlbum() + " and is liked: " + getLiked();
  }
}