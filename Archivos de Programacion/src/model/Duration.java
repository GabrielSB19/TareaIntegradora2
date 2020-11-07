/*
Gabriel Suarez
A00368589
*/


package model;

public class Duration{

  /**
  *Constructor attributes to build a Duration type object.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private int minutes;
  private int seconds;

  /**
  *Allows to create the Duration class constructor.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> The constructor has been created. <br>
  @param minutes minutes of the song. minutes = greater than 0 and less than 60.
  @param seconds seconds of the song. seconds = greater than 0 and less than 60.
  */

  public Duration(int minutes, int seconds){
    this.minutes = minutes;
    this.seconds = seconds;
  }

  /**
  *Getter of minutes attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return minutes.
  */

  public int getMinutes(){
    return minutes;
  }

  /**
  *Setter of minutes attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param minutes minutes of the song. minutes = greater than 0 and less than 60.
  */

  public void setMinutes(int minutes){
    this.minutes = minutes;
  }

  /**
  *Getter of seconds attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return seconds.
  */

  public int getSeconds(){
    return seconds;
  }

  /**
  *Setter of seconds attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param seconds seconds of the song. seconds = greater than 0 and less than 60.
  */

  public void setSeconds(int seconds){
    this.seconds = seconds;
  }

  /**
  *Allows the transformation of minutes and seconds to the MM:SS format.<br>
  *<b>pre: </b> At least one song and one user has been created.<br>
  *<b>post:</b> The duration has been updated to the appropriate format.<br>
  @return durationSong.
  */

  public String toDuration(){
    String durationSong;
    durationSong = minutes+":"+seconds;
    return durationSong;
  }

  /**
  *Allows to transform from MM:SS format to seconds to add them in the PlayList.<br>
  *<b>pre: </b> At least one song and one user has been created.<br>
  *<b>post:</b> The duration has been transformed to seconds.<br>
  @return secondsTotal.
  */

  public int durationToSeconds(){
    int secondsTotal = 0;
    secondsTotal = (minutes*60)+seconds;
    return secondsTotal;
  }
}
