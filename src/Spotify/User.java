package Spotify;
import java.io.*;

public class User {

  // instance variables
  private String username;
  private String password;

  /** 
  * User constructor. Creates an instance of the object for User. 
  *
  * @param username - a string that shows the username of the account
  * @param password - a string that shows the password of the account
  */
  public User(String newUsername, String newPassword) {
    username = newUsername;
    password = newPassword;
  }

  /** 
  * Getter method that returns the username 
  * 
  * @return username
  */
  public String getUsername() {
    return username;
  }

  /** 
  * Getter method that returns the password
  * 
  * @return password
  */
  public String getPassword() {
    return password;
  }

  /** 
  * toString method that returns a greeting message
  *
  * @param username - a string that shows the username
  */
  public String toString() {
    return "Welcome back " + username + " to Spotify!";
  }
}