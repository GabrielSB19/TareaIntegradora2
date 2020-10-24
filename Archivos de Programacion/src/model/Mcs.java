/*
Gabriel Suarez
A00368589
*/

package model;

public class Mcs{

  public static final int MAX_USER = 10;
  public static final int MAX_SONG = 2;
  public static final int MAX_PLAYLIST = 20;
  private int numUser;
  private int numSongs;

  private User[] user;
  private Song[] poolSong;
  //private PlayList[] thePlayLists;
  public Mcs(){
    user = new User[MAX_USER];
    poolSong = new Song[MAX_SONG];
    numUser = 0;
    numSongs = 0;
  }

    //thePlayLists = new PlayList[MAX_PLAYLIST];

  public void addUser(String userName, String password, int ageUser){
    boolean space = false;
    for(int i = 0; i<MAX_USER && !space; i++){
      if(user[i] == null){
        user[i] = new User(userName, password, ageUser);
        space = true;
        numUser++;
      }
    }
  }

  public boolean hasUser(){
    return numUser < MAX_USER;
  }

  public String showUser(){
    String dataUser = "";
    for(int i = 0; i<MAX_USER; i++){
      if(user[i] != null){
        dataUser += user[i].showDataUser();
      }
    }
    return dataUser;
  }

  public void addSongPool(String tittleSong, String artistName, String realaseDateSong, int minutes, int seconds, String genderSong){
    Duration durationSong = new Duration(minutes, seconds);
    Gender askGenderSong = Gender.valueOf(genderSong);
    boolean space1 = false;
    for(int i = 0; i<MAX_SONG && !space1; i++){
      if(poolSong[i] == null){
        poolSong[i] = new Song(tittleSong, artistName, realaseDateSong, durationSong, askGenderSong);
        space1 = true;
        numSongs++;
      }
    }
  }

  public boolean hasSong(){
    return numSongs < MAX_SONG;
  }

  public String showSong(){
    String dataSong ="";
    for(int i = 0; i<MAX_SONG; i++){
      if(poolSong[i] != null){
        dataSong += poolSong[i].showDataSong();
      }
    }
    return dataSong;
  }

/*
  public void addSongPool(){
    for(int i = 0; i<MAX_SONG; i++){
      if(poolSong[i] == null){
        poolSong[i] = new Song();
      }
    }
  }

  public void addPlayList(){
    for(int i = 0; i<MAX_PLAYLIST; i++){
      if(thePlayLists[i] == null){
        thePlayLists[i] == new addPlayList()
      }
    }
  }
  */
}
