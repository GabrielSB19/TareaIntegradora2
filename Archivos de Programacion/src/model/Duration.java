/*
Gabriel Suarez
A00368589
*/

package model;

public class Duration{

  private int minutes;
  private int seconds;

  public Duration(int minutes, int seconds){
    this.minutes = minutes;
    this.seconds = seconds;
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
}
