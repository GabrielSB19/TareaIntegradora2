/*
Gabriel Suarez
A00368589
*/

package model;

public class PlayList{

  private String namePlayList;
  private Duration durationPlayList;
  private Gender genderPlayList;
  private int typePlayList;

  public PlayList(String namePlayList, Duration durationPlayList, Gender genderPlayList, int typePlayList){
    this.namePlayList = namePlayList;
    durationPlayList = 0;
    gender = "";
    typePlayList = 0;
  }

  public String getNamePlayList(){
    return namePlayList;
  }
}
