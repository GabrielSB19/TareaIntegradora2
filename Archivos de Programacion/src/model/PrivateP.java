/*
Gabriel Suarez
A00368589
*/

package model;

public class PrivateP extends PlayList{

  private User user1;

  public PrivateP(String namePlayList, Duration durationPlayList, Gender genderPlayList, User user1){
    super(namePlayList, durationPlayList, genderPlayList);
    this.user1 = user1;
  }

  public User getUser1(){
    return getUser;
  }

  public void getUser1(User user1){
    this.user1 = user1;
  }
}
