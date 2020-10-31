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

  public Gender[] uptadeGender(){
    Gender[] newsGenders = new Gender[NUM_MAX_SONGS];
    for(int i = 0; i<NUM_MAX_SONGS; i++){
      if (songtoPlayList[i] != null){
        newsGenders[i] = songtoPlayList[i].getGenderSong();
      }
    }
    return newsGenders;
  }

  public String changeGender(Gender[] newsGenders){
    boolean stop = false;
    String genderUptade = "";
    if(newsGenders[0] == null){
      genderUptade = "DESCONOCIDO";
    }
    else {
      for(int i = 0; i<NUM_MAX_SONGS; i++){
        for(int j = 0; j<NUM_MAX_SONGS-1 && !stop; j++){
          if(i != j){
            if(newsGenders[i] == newsGenders[j]){
              newsGenders[i] = null;
            }
          }
        }
      }
      for(int k = 0; k<NUM_MAX_SONGS; k++){
        if(newsGenders[k] != null){
          genderUptade += newsGenders[k]+", ";
        }
      }
    }
    return genderUptade;
  }

  public int uptadeDuration(){
    int newSecondsTotal = 0;
    for (int i = 0; i<NUM_MAX_SONGS; i++){
      if(songtoPlayList[i] != null){
        newSecondsTotal += songtoPlayList[i].newDurationSong();
      }
    }
    return newSecondsTotal;
  }

  public String uptadeDurationFormat(int newSecondsTotal){
      String newTime = "";
      int newMinutes = newSecondsTotal/60;
      int newSeconds = newSecondsTotal-(newMinutes*60);
      newTime = newMinutes+":"+newSeconds;
      return newTime;
  }


  public String showDatePlayList(){
    String dataPlayList="";
    dataPlayList = "************ PlayList ************\n";
    dataPlayList += "** Tittle: "+getNamePlayList();
    return dataPlayList;
  }
}
