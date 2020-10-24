/*
Gabriel Suarez
A00368589
*/

package model;

public class PlayList{

  private String namePlayList;
  private Duration durationPlayList;
  private Gender genderPlayList;

  public PlayList(String namePlayList){
    this.namePlayList = namePlayList;
    this.durationPlayList = new Duration(0,0); 
    this.genderPlayList = genderPlayList;
  }

  public String getNamePlayList(){
    return namePlayList;
  }

  public void setNamePlayList(){
    this.namePlayList = namePlayList;
  }

  public Duration getDurationPlayList(){
    return durationPlayList;
  }

  public void setDurationPlayList(){
    this.durationPlayList = durationPlayList;
  }

  public Gender getGenderPlayList(){
    return genderPlayList;
  }

  public void setGenderPlayList(){
    this.genderPlayList = genderPlayList;
  }
}
