/*
Gabriel Suarez
A00368589
*/

package model;

public class Duration{

  private int minutes;
  private int seconds;

  public Duration(int minutes, int seconds){
    this.minutes = 0;
    this.seconds = 0;
  }

  public int getMinutes(){
    return minutes;
  }

  public void setMinutes(int minutes){
    this.minutes = minutes;
  }

  public int getSeconds(){
    return seconds;
  }

  public void setSeconds(int seconds){
    this.seconds = seconds;
  }

  public String toDuration(){
    String durationSong;
    durationSong = minutes+":"+seconds;
    return durationSong;
  }
}
