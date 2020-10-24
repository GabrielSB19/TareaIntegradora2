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

  public String getArtistName(){
    return artistName;
  }

  public String getRealaseDateSong(){
    return realaseDateSong;
  }

  public Duration getDurationSong(){
    return durationSong;
  }

  public Gender getGenderSong(){
    return genderSong;
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
