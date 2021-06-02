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
    int choice = 50004040; 
    String choice2;
    int iii = 0;
    int iiii = 0;

    // logo
    System.out.println();
    System.out.println(" * * *  * * *  * * *  * * *  * * *  * * *  *   *");
    System.out.println(" *      *   *  *   *    *      *    *      *   *");
    System.out.println(" *      *   *  *   *    *      *    *      *   *");
    System.out.println(" * * *  * * *  *   *    *      *    * *    * * *");
    System.out.println("     *  *      *   *    *      *    *          *");
    System.out.println("     *  *      *   *    *      *    *          *");
    System.out.println(" * * *  *      * * *    *    * * *  *          *");
    System.out.println();

    // login
    System.out.println("Please enter your username and password to access your account.");
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

    // Create album and add songs
    Album Sour = new Album("Sour", "Olivia Rodrigo", 11);

    Sour.addSong(Brutal);
    Sour.addSong(Traitor);
    Sour.addSong(Happier);

    // Create Playlist    
    Playlist Drive = new Playlist("Driving");
    Playlist Chill = new Playlist("Chill");
    Playlist Throw = new Playlist("Throwbacks");
    
    // Add Songs to playlists
    Drive.add(Maniac); 
    Drive.addSong(Blood);
    Drive.addSong(Beamin); 
    Chill.addSong(Golden);
    Chill.addSong(Lie);
    Throw.addSong(Fireflies);
    Throw.addSong(Bohemian);

    // Start program and run like spotify
    while (choice != 4) {
      if (inputUser.equals("KyleM21") && inputPass.equals("Hello123")) {

        User user1 = new User("KyleM21", "Hello123");
        if (iiii == 1) {
          System.out.println(user1);
          System.out.println();
          iiii = iiii + 1;
        }

        // Print main menu
        System.out.println("Main Menu");
        System.out.println("Please choose from the following:");
        System.out.println("1 - View your library");
        System.out.println("2 - View your albums  ");
        System.out.println("3 - View your playlists");
        System.out.println("4 - View your podcasts");
        System.out.println("5 - Log off");
        choice = Integer.parseInt(keyboard.readLine());

        // Complete chosen task
        if(choice == 1) {
          System.out.println("YOUR LIBRARY");
          System.out.println ("*************************************************************");
          System.out.println(Golden);
          /*System.out.println(Selfish);
          System.out.println(Easy);
          System.out.println(Lose);
          System.out.println(Youbroke);
          System.out.println(Stuck);
          System.out.println(Mad);
          System.out.println(ThisCity);
          System.out.println(Cool);
          System.out.println(Physical);
          System.out.println(Hallucinate);
          System.out.println();*/
        } 
        else if (choice == 2) {
          System.out.println("ALBUM FUTURE");
          System.out.println("*************************************************************");
          System.out.println(Sour);
          System.out.println();
        } 
        else if (choice == 3) {
          System.out.println("Please choose a playlist from the following:");
          System.out.println("1 - New");
          System.out.println("2 - Chilling ");
          System.out.println("3 - Cool Stuff");
          choice2 = keyboard.readLine();

          if (choice2.equals("1")) {
            System.out.println("PLAYLIST NEW");
            System.out.println("*************************************************************");
            System.out.println(Drive);
            System.out.println();
          } 
          else if (choice2.equals("2")) {
            System.out.println("PLAYLIST CHILLING");
            System.out.println("*************************************************************");
            System.out.println(Chill);
            System.out.println();
          } 
          else if (choice2.equals("3")) {
            System.out.println("PLAYLIST COOL STUFF");
            System.out.println("*************************************************************");
            System.out.println(Throw);
            System.out.println();
          } 
          else {
            System.out.println("Invalid Option");
          }
        } 
        else if (choice == 4) {
          System.out.println("Thank you for using spotify!");
        } 
        else {
          System.out.println("Invalid Option");
        }

      } 
    
      else {
        System.out.println("INVALID USERNAME/PASSWORD PLEASE TRY AGAIN");
        iii = iii + 1;
        if(iii == 5) {
          System.out.println("YOU HAVE ATTEMPTED TO MANY TIMES. PLEASE EXIT AND TRY AGAIN LATER");
        }
      }
    }
    
    System.out.println("Logging off. Nice seeing you!");
  }
}