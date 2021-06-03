package Spotify;
import java.io.*;
import java.util.ArrayList;
import Spotify.Library;
import Spotify.Album;
import Spotify.Playlist;

public class SpotifyMain {
  public static void main(String[] args) throws IOException {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // variables
    String inputUser;
    String inputPass; 
    int choice = 0; 
    String choice2;
    int iii = 0;

    // logo
    System.out.println();
    System.out.println(" *****  *****  *****  *****  *****  *****  *   *");
    System.out.println(" *      *   *  *   *    *      *    *      *   *");
    System.out.println(" *****  *****  *   *    *      *    ***    *****");
    System.out.println("     *  *      *   *    *      *    *        *  ");
    System.out.println(" *****  *      *****    *    *****  *        *  ");
    System.out.println();

    // login
    System.out.println("Enter username and password to access your account.");
    System.out.print("Username: ");
    inputUser = keyboard.readLine();
    System.out.print("Password: ");
    inputPass = keyboard.readLine();

    // Create Songs
    Song Maniac = new Song("Maniac", "Conan Gray", "Kid Krow", "2020", true);
    Song Golden = new Song("Golden", "Harry Styles", "Fine Line", "2019", true);
    Song Fireflies = new Song("Fireflies", "Owl City", "Ocean Eyes", "2009", false);
    Song Blood = new Song("Bad Blood", "Taylor Swift", "1989", "2014", true);
    Song Butter = new Song("Butter", "BTS", "NONE", "2021", false);
    Song Beamin = new Song("BEAMIN'", "Quadeca", "NONE", "2019", false);
    Song Bohemian = new Song("Bohemian Rapsody", "Queen", "A Night at the Opera", "1975", true);
    Song Lie = new Song("Lie to Me", "5 Seconds of Summer", "Youngblood", "2018", false);

    // Create Album Songs
    Song Brutal = new Song("Brutal", "Olivia Rodrigo", "Sour", "2021", false);
    Song Traitor = new Song("Traitor", "Olivia Rodrigo", "Sour", "2021", true);
    Song Happier = new Song("Happier", "Olivia Rodrigo", "Sour", "2021", true);

    Song Taunt = new Song("Taunt", "Lovejoy", "Are You Alright?", "2021", true);
    Song OneDay = new Song("One Day", "Lovejoy", "Are You Alright?", "2021", false);
    Song Sells = new Song("Sex Sells", "Lovejoy", "Are You Alright?", "2021", true);
    Song Cause = new Song("Cause for Concern", "Lovejoy", "Are You Alright?", "2021", false);

    // Create albums and add songs
    // Album: Sour
    Album Sour = new Album("Sour", "Olivia Rodrigo", 11);

    Sour.addSong(Brutal);
    Sour.addSong(Traitor);
    Sour.addSong(Happier);

    // Album: Are You Alright? 
    Album Alright = new Album("Are You Alright?", "Lovejoy", 4); 

    Alright.addSong(Taunt);
    Alright.addSong(OneDay); 
    Alright.addSong(Sells);
    Alright.addSong(Cause); 

    // Create Playlist    
    Playlist Drive = new Playlist("Driving");
    Playlist Chill = new Playlist("Chill");
    Playlist Throw = new Playlist("Throwbacks");
    
    // Add Songs to playlists
    Drive.addSong(Maniac); 
    Drive.addSong(Brutal);
    Drive.addSong(Beamin); 
    Drive.addSong(OneDay); 
    Chill.addSong(Golden);
    Chill.addSong(Lie);
    Chill.addSong(Sells); 
    Throw.addSong(Fireflies);
    Throw.addSong(Bohemian);

    // Start program and run like spotify
    if (inputUser.equals("ashley") && inputPass.equals("qwerty123")) {

      // if you enter the correct username and password, you can login into the spotify account
      
      while (choice != 4) {
        // Print main menu
        System.out.println("Main Menu");
        System.out.println("Choose what you would like to do:");
        System.out.println("1 - View your library");
        System.out.println("2 - View your albums  ");
        System.out.println("3 - View your liked songs");
        System.out.println("4 - Log off");
        choice = Integer.parseInt(keyboard.readLine());

        // Complete chosen task
        if(choice == 1) {
          System.out.println("YOUR LIBRARY: ");
          System.out.println ("*************************************************************");
          System.out.println("Choose a playlist from the following:");
          System.out.println("1 - Driving");
          System.out.println("2 - Chil");
          System.out.println("3 - Throwbacks");
          choice2 = keyboard.readLine();

          if (choice2.equals("1")) {
            System.out.println("PLAYLIST: DRIVING");
            System.out.println("*************************************************************");
            System.out.println(Drive);
            System.out.println();
          } 
          else if (choice2.equals("2")) {
            System.out.println("PLAYLIST: CHILL");
            System.out.println("*************************************************************");
            System.out.println(Chill);
            System.out.println();
          } 
          else if (choice2.equals("3")) {
            System.out.println("PLAYLIST: THROWBACKS");
            System.out.println("*************************************************************");
            System.out.println(Throw);
            System.out.println();
          } 
          else {
            System.out.println("Invalid Option");
          }
        }

        else if (choice == 2) {
          System.out.println("Choose an album to view:");
          System.out.println("1 - Sour");
          System.out.println("2 - Are You Alright?");
          choice2 = keyboard.readLine();

          // Print the album that is chosen 
          if (choice2.equals("1")) {
            System.out.println("ALBUM: SOUR");
            System.out.println("*************************************************************");
            System.out.println(Sour);
            System.out.println();
          } 
          else if (choice2.equals("2")) {
            System.out.println("ALBUM: ARE YOU ALRIGHT?");
            System.out.println("*************************************************************");
            System.out.println(Alright);
            System.out.println();
          }
        }
        else if (choice == 3) {
          System.out.println("YOUR LIKED SONGS");
          System.out.println(Maniac);
          System.out.println(Golden);
          System.out.println(Blood);
          System.out.println(Bohemian);
          System.out.println(Traitor);
          System.out.println(Happier);
          System.out.println(Taunt);
          System.out.println(Sells);
          System.out.println();
        }
        else if (choice == 4) {
          System.out.println("Thank you for using spotify!");
        } 
        else {
          System.out.println("Invalid Option");
        }
      } 
    
      System.out.println("Logging off. Nice seeing you!");
     
    }

    else {
    System.out.println("INVALID USERNAME/PASSWORD PLEASE TRY AGAIN");
    }
    
  }
}