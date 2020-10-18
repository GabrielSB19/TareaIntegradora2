/*
Gabriel Suarez
A00368589
*/

package model;

public class Song{

  private String tittleSong;
  private String artistName;
  private String realaseDateSong;
  private Duration durationSong;
  private Gender genderSong;
  private int index;
  private Gender[] allGender = Gender.values();

  public Song(String tittleSong, String artistName, String realaseDateSong, Duration durationSong, int index){
    this.tittleSong = tittleSong;
    this.artistName = artistName;
    this.realaseDateSong = realaseDateSong;
    this.durationSong = durationSong;
    genderSong = allGender[index-1];
  }

  public String getTittleSong(){
    return tittleSong;
  }

  public String getArtistName(){
    return artistName;
  }

  public String getRealaseDateSong(){
    return realaseDateSong;
  }

  public Duration getDurationSong(){
    return durationSong;
  }
}
