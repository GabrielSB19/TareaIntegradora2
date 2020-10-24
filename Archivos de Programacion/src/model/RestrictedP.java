/*
Gabriel Suarez
A00368589
*/

package model;

public class RestrictedP extends PlayList{

  private final static int MAX_PLAYLISTUSER;

  private User[] userP;
  userP = new User[MAX_PLAYLISTUSER];

  public RestrictedP(String namePlayList, Duration durationPlayList, Gender genderPlayList, User[] userP){
    super(namePlayList, durationPlayList, genderPlayList);
    this.userP = userP;
  }

  public User[] getUserP(){
    return userP;
  }

  public void setUserP(User[] userP){
    this.userP = userP;
  }
}
