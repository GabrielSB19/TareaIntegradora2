/*
Gabriel Suarez
A00368589
*/

package model;

public class Song{

  /**
  *Constructor attributes to build a Song type object.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private String tittleSong;
  private String artistName;
  private String realaseDateSong;
  private Duration durationSong;
  private Gender genderSong;

  /**
  *Allows to create the Song class constructor.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> The constructor has been created. <br>
  @param tittleSong tittle of the song. tittleSong != "" and must be a string.
  @param artistName name of the artist. artistName != "" and must be a string.
  @param realaseDateSong release date of the song. realaseDateSong != "" and in the format DD/MM/AA.
  @param durationSong the duration of the song. durationSong = minutes and second are int.
  @param genderSong the gender of the song. genderSong = ROCK, HIPHOP, MUSICACLASICA, RAGGAE, SALSA, METAL, DESCONOCIDO.
  */

  public Song(String tittleSong, String artistName, String realaseDateSong, Duration durationSong, Gender genderSong){
    this.tittleSong = tittleSong;
    this.artistName = artistName;
    this.realaseDateSong = realaseDateSong;
    this.durationSong = durationSong;
    this.genderSong = genderSong;
  }

  /**
  *Getter of tittleSong attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return tittleSong.
  */

  public String getTittleSong(){
    return tittleSong;
  }

  /**
  *Setter of tittleSong attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param tittleSong the song name. tittleSong != "" and can have space.
  */

  public void setTittleSong(String tittleSong){
    this.tittleSong = tittleSong;
  }

  /**
  *Getter of artistName attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return artistName.
  */

  public String getArtistName(){
    return artistName;
  }

  /**
  *Setter of artistName attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param artistName name of the artist who composed the song. artistName != "".
  */

  public void setArtistName(String artistName){
    this.artistName = artistName;
  }

  /**
  *Getter of realaseDateSong attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return realaseDateSong.
  */

  public String getRealaseDateSong(){
    return realaseDateSong;
  }

  /**
  *Setter of realaseDateSong attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param realaseDateSong the release date of the song. realaseDateSong must be in the next format DD/MM/AA.
  */

  public void setRealaseDateSong(String realaseDateSong){
    this.realaseDateSong = realaseDateSong;
  }

  /**
  *Getter of durationSong attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return durationSong.
  */

  public Duration getDurationSong(){
    return durationSong;
  }

  /**
  *Setter of durationSong attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param durationSong the song duration. durationSong = minutes and second are int.
  */

  public void setDurationSong(Duration durationSong){
    this.durationSong = durationSong;
  }

  /**
  *Getter of genderSong attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return genderSong.
  */

  public Gender getGenderSong(){
    return genderSong;
  }

  /**
  *Setter of genderSong attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param genderSong the gender of the song. genderSong = ROCK, HIPHOP, MUSICACLASICA, RAGGAE, SALSA, METAL, DESCONOCIDO.
  */

  public void setGenderSong(Gender genderSong){
    this.genderSong = genderSong;
  }

  /**
  *Allows to transform the duration format to MM:SS.<br>
  *<b>pre: </b> At least one song must be created with a duration time.<br>
  *<b>post:</b> The minutes and seconds have been updated to MM:SS format.<br>
  @return durationInSeconds.
  */

  public int newDurationSong(){
    int durationInSeconds = getDurationSong().durationToSeconds();
    return durationInSeconds;
  }

  /**
  *Allows to concatenate all song data for display in the console.<br>
  *<b>pre: </b> At least one song and one user has been created.<br>
  *<b>post:</b> Show song data.<br>
  @return dataSong.
  */

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
