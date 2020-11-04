/*
Gabriel Suarez
A00368589
*/

package model;

public abstract class PlayList{

  private final static int NUM_MAX_SONGS = 30;

  /**
  *Constructor attributes to build PlayList type object.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private String namePlayList;
  private Duration durationPlayList;
  private Gender genderPlayList;
  private Song[] songtoPlayList = new Song[NUM_MAX_SONGS];

  /**
  *Allows to create the PlayList class constructor.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> The constructor has been created. <br>
  @param namePlayList name of the PlayList. namePlayList != "".
  */

  public PlayList(String namePlayList){
    this.namePlayList = namePlayList;
    this.durationPlayList = new Duration(0, 0);
    this.songtoPlayList = songtoPlayList;
  }

  /**
  *Getter of namePlayList attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return namePlayList.
  */

  public String getNamePlayList(){
    return namePlayList;
  }

  /**
  *Setter of namePlayList attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param namePlayList name of the PlayList. namePlayList != "".
  */

  public void setNamePlayList(String namePlayList){
    this.namePlayList = namePlayList;
  }

  /**
  *Getter of durationPlayList attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return durationPlayList.
  */

  public Duration getDurationPlayList(){
    return durationPlayList;
  }

  /**
  *Setter of durationPlayList attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param durationPlayList the PlayList duration. durationPlayList = minutes and second are int.
  */

  public void setDurationPlayList(Duration durationPlayList){
    this.durationPlayList = durationPlayList;
  }

  /**
  *Getter of genderPlayList attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return genderPlayList.
  */

  public Gender getGenderPlayList(){
    return genderPlayList;
  }

  /**
  *Setter of genderPlayList attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param genderPlayList the gender of the song. genderSong = ROCK, HIPHOP, MUSICACLASICA, RAGGAE, SALSA, METAL, DESCONOCIDO.
  */

  public void setGenderPlayList(Gender genderPlayList){
    this.genderPlayList = genderPlayList;
  }

  /**
  *Allows to add a song to the arrangement of songs in each PlayList.<br>
  *<b>pre: </b> At least one user, one song and one PlayList must be created.<br>
  *<b>post:</b> The song has been added to the PlayList.<br>
  @param mySongToPlayList song to be added. mySongToPlayList = the song must be in the array of songs in the MCS.
  */

  public void addSongatOne(Song mySongToPlayList){
    boolean out = false;
    for(int i = 0; i<NUM_MAX_SONGS && !out; i++){
      if(songtoPlayList[i] == null){
        songtoPlayList[i] = mySongToPlayList;
        out = true;
      }
    }
  }

  /**
  *Allows to store the genres of the songs that are in the PlayList.<br>
  *<b>pre: </b> At least one user, one song and one PlayList must be created.<br>
  *<b>post:</b> The genre of the song has been added to the genders array.<br>
  @return newsGenders.
  */

  public Gender[] uptadeGender(){
    Gender[] newsGenders = new Gender[NUM_MAX_SONGS];
    for(int i = 0; i<NUM_MAX_SONGS; i++){
      if (songtoPlayList[i] != null){
        newsGenders[i] = songtoPlayList[i].getGenderSong();
      }
    }
    return newsGenders;
  }

  /**
  *Allows to erase the repeated genders found in the Genders array.<br>
  *<b>pre: </b> At least one user, one song and one PlayList must be created.<br>
  *<b>post:</b> Genres without repetition.<br>
  @param newsGenders the array Genders. newsGenders = ROCK, HIPHOP, MUSICACLASICA, RAGGAE, SALSA, METAL, DESCONOCIDO.
  @return genderUptade.
  */

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

  /**
  *Allows to update the duration of the PlayList according to the songs added to the PlayList.<br>
  *<b>pre: </b> At least one user, one song and one PlayList must be created.<br>
  *<b>post:</b> The duration has been updated and is in seconds.<br>
  @return newSecondsTotal.
  */

  public int uptadeDuration(){
    int newSecondsTotal = 0;
    for (int i = 0; i<NUM_MAX_SONGS; i++){
      if(songtoPlayList[i] != null){
        newSecondsTotal += songtoPlayList[i].newDurationSong();
      }
    }
    return newSecondsTotal;
  }

  /**
  *Allows to transform the PlayList duration in seconds to the MM:SS format.<br>
  *<b>pre: </b> At least one user, one song and one PlayList must be created.<br>
  *<b>post:</b> The duration has been updated to MM:SS format.<br>
  @param newSecondsTotal the duration PlayList in seconds. newSecondsTotal = greater than 0
  @return newTime.
  */

  public String uptadeDurationFormat(int newSecondsTotal){
      String newTime = "";
      int newMinutes = newSecondsTotal/60;
      int newSeconds = newSecondsTotal-(newMinutes*60);
      newTime = newMinutes+":"+newSeconds;
      return newTime;
  }

  /**
  *Allows to concatenate all the general data of the Playlist for display in the console.<br>
  *<b>pre: </b> At least one user, one song and one PlayList must be created..<br>
  *<b>post:</b> Show general data PlayList.<br>
  @return dataPlayList.
  */

  public String showDatePlayList(){
    String dataPlayList="";
    dataPlayList = "************ PlayList ************\n";
    dataPlayList += "** Tittle: "+getNamePlayList();
    return dataPlayList;
  }
}
