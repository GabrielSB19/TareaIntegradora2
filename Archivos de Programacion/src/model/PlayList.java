/*
Gabriel Suarez
A00368589
*/

package model;

public class PlayList{

  private final static int NUM_MAX_SONGS = 30;

  private String namePlayList;
  private Duration durationPlayList;
  private Gender genderPlayList;
  private Song[] songtoPlayList = new Song[NUM_MAX_SONGS];

  public PlayList(String namePlayList){
    this.namePlayList = namePlayList;
    this.durationPlayList = new Duration(0, 0);
    genderPlayList = Gender.DESCONOCIDO;
    this.songtoPlayList = songtoPlayList;
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

  public void addSongatOne(Song mySongToPlayList){
    boolean out = false;
    for(int i = 0; i<NUM_MAX_SONGS && !out; i++){
      if(songtoPlayList[i] == null){
        songtoPlayList[i] = mySongToPlayList;
        out = true;
      }
    }
  }
  public String showDatePlayList(){
    String dataPlayList="";
    dataPlayList = "************ PlayList ************\n";
    dataPlayList += "** Tittle: "+getNamePlayList()+"\n";
    dataPlayList += "** Duration: "+getDurationPlayList().toDuration()+"\n";
    dataPlayList += "** Gender: "+getGenderPlayList();
    return dataPlayList;
  }
}
