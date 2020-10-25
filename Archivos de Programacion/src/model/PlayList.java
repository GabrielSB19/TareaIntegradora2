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
    this.durationPlayList = new Duration(0, 0);
    genderPlayList = Gender.DESCONOCIDO;
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

  public String showDatePlayList(){
    String dataPlayList="";
    dataPlayList = "************ PlayList ************\n";
    dataPlayList += "** Tittle: "+getNamePlayList()+"\n";
    dataPlayList += "** Duration: "+getDurationPlayList().toDuration()+"\n";
    dataPlayList += "** Genre: "+getGenderPlayList();
    return dataPlayList;
  }
}
