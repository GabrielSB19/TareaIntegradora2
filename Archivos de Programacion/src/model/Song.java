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

  public Song(String tittleSong, String artistName, String realaseDateSong, Duration durationSong, Gender genderSong){
    this.tittleSong = tittleSong;
    this.artistName = artistName;
    this.realaseDateSong = realaseDateSong;
    this.durationSong = durationSong;
    this.genderSong = genderSong;
  }

  public String getTittleSong(){
    return tittleSong;
  }

  public void setTittleSong(String tittleSong){
    this.tittleSong = tittleSong;
  }

  public String getArtistName(){
    return artistName;
  }

  public void setArtistName(String artistName){
    this.artistName = artistName;
  }

  public String getRealaseDateSong(){
    return realaseDateSong;
  }

  public void setRealaseDateSong(String realaseDateSong){
    this.realaseDateSong = realaseDateSong;
  }

  public Duration getDurationSong(){
    return durationSong;
  }

  public void setDurationSong(Duration durationSong){
    this.durationSong = durationSong;
  }

  public Gender getGenderSong(){
    return genderSong;
  }

  public void setGenderSong(Gender genderSong){
    this.genderSong = genderSong;
  }

  public int newDurationSong(){
    int durationInSeconds = getDurationSong().durationToSeconds();
    return durationInSeconds;
  }

  public String showDataSong(){
    String dataSong = "************ Song ************\n";
    dataSong += "**  Tittle: "+getTittleSong()+"\n";
    dataSong += "**  Artist: "+getArtistName()+"\n";
    dataSong += "**  Duration: "+getDurationSong().toDuration()+"\n";
    dataSong += "**  Genre:  "+getGenderSong()+"\n";
    dataSong += "******************************\n";
    return dataSong;
  }
}
