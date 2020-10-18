/*
Gabriel Suarez
A00368589
*/

package model;

public class User{

  private String userName;
  private String password;
  private int ageUser;
  private CategoryUser categoryUser;

  public User(String userName, String password, int ageUser){
    this.userName = userName;
    this.password = password;
    this.ageUser = ageUser;
    categoryUser = CategoryUser.newbie;
  }

  public String getUserName(){
    return userName;
  }

  public String getPassword(){
    return password;
  }

  public int getAgeUser(){
    return ageUser;
  }
}
