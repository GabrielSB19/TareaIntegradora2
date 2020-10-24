/*
Gabriel Suarez
A00368589
*/

package model;

public class Mcs{

  public static final int MAX_USER = 10;
  public static final int MAX_SONG = 30;
  public static final int MAX_PLAYLIST = 20;
  private int numUser;

  private User[] user;
  //private Song[] poolSong;
  //private PlayList[] thePlayLists;
  public Mcs(){
    user = new User[MAX_USER];
    numUser = 0;
  }

    //poolSong = new Song[MAX_SONG];
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
