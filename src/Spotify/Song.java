package Spotify;
import java.io.*;

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
}