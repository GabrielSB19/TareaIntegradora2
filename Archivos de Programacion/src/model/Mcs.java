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
  private int numSongs;
  private int numPlayList;

  private User[] user;
  private Song[] poolSong;
  private PlayList[] thePlayLists;
  public Mcs(){
    user = new User[MAX_USER];
    poolSong = new Song[MAX_SONG];
    thePlayLists = new PlayList[MAX_PLAYLIST];
    numUser = 0;
    numSongs = 0;
    numPlayList = 0;
  }

  public boolean hasUser(){
    return numUser < MAX_USER;
  }

  public boolean hasSong(){
    return numSongs < MAX_SONG;
  }

  public boolean hasPlayList(){
    return numPlayList < MAX_PLAYLIST;
  }

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


  public String showSong(){
    String dataSong ="";
    for(int i = 0; i<MAX_SONG; i++){
      if(poolSong[i] != null){
        dataSong += poolSong[i].showDataSong();
      }
    }
    return dataSong;
  }

  public String showNameUser(){
    String nameUsertoSong = "";
    for(int i = 0; i<MAX_USER; i++){
      if(user[i] != null){
        nameUsertoSong += "["+(i+1)+"]"+user[i].getUserName()+"\n";
      }
    }
    return nameUsertoSong;
  }

  public void userIndex(int namePosicion){
    int index = namePosicion -1;
    user[index].setAmountCategory(user[index].getAmountCategory()+1);
  }

  public void changeCategory(int index){
    if(user[index].getAmountCategory()>=3 && user[index].getAmountCategory()<=10){
      user[index].setCategoryUser(user[index].newCategory("littleContributor"));
    }
    else if(user[index].getAmountCategory()>10 && user[index].getAmountCategory()<30){
      user[index].setCategoryUser(user[index].newCategory("mildContributor"));
    }
    else if(user[index].getAmountCategory() == 10){
      user[index].setCategoryUser(user[index].newCategory("starContributor"));
    }
  }

  public void addPlayListPublic(String namePlayList){
    boolean space2 = false;
    for(int i = 0; i<MAX_PLAYLIST && !space2; i++){
      if(thePlayLists[i] == null){
        PlayList publicPlayList = new PublicP(namePlayList);
        thePlayLists[i] = publicPlayList;
        numPlayList++;
        space2 = true;
      }
    }
  }

  public void addPlayListPriavte(String namePlayList, User userName1){
    boolean space3 = false;
    for(int i = 0; i<MAX_PLAYLIST && !space3; i++){
      if(thePlayLists[i] == null){
        PlayList privatePlayList = new PrivateP(namePlayList, userName1);
        thePlayLists[i] = privatePlayList;
        numPlayList++;
        space3 = true;
      }
    }
  }

  public void addPlayListRestricted(String namePlayList, User[] usersRestrictedPlayLists){
    boolean space4 = false;
    for(int i = 0; i<MAX_PLAYLIST && !space4; i++){
      if(thePlayLists[i] == null){
        PlayList restritecPlayList = new RestrictedP(namePlayList, usersRestrictedPlayLists);
        thePlayLists[i] = restritecPlayList;
        numPlayList++;
        space4 = true;
      }
    }
  }

  public String showPlayList(){
    String dataPlayList = "";
    for(int i = 0; i<MAX_PLAYLIST; i++){
      if(thePlayLists[i] != null){
        dataPlayList += thePlayLists[i].showDatePlayList();
      }
    }
    return dataPlayList;
  }

  public String userNameIndex(int index){
    index = index-1;
    String userName1 = "";
    userName1 = user[index].getUserName();
    return userName1;
  }

  public User whoIsTheUser(String name){
    boolean space5 = false;
    User userPrivate = null;
    for(int i = 0; i<MAX_USER && !space5; i++){
      userPrivate = user[i];
      if(userPrivate.getUserName().equals(name)){
        space5 = true;
      }
    }
    return userPrivate;
  }

  public User[] usersRestricted(int[] indexs){
    User[] usersRestrictedPlayLists = new User[5];
    for(int i = 0; i<5; i++){
      usersRestrictedPlayLists[i] = user[indexs[i]];
    }
    return usersRestrictedPlayLists;
  }

  public double[] aksPointsPlayListPublic(double grade){
    boolean space6 = false;
    double [] average = new double[MAX_USER];
    for(int i = 0; i<MAX_USER && !space6; i++){
      if(average[i] != 0){
        average[i] = grade;
      }
    }
    return average;
  }

  public String showPlayListNames(){
    String namePlayList = "";
    for(int i = 0; i<MAX_PLAYLIST; i++){
      if(thePlayLists[i] != null){
        namePlayList += "["+(i+1)+"]"+thePlayLists[i].getNamePlayList()+"\n";
      }
    }
    return namePlayList;
  }

  public String showSongName(){
    String nameSong = "";
    for (int i = 0; i<MAX_SONG; i++){
      if(poolSong[i] != null){
        nameSong += "["+(i+1)+"]"+poolSong[i].getTittleSong()+"\n";
      }
    }
    return nameSong;
  }

  public void addSongInThePlayList(int index1, int index2){
    index1 = index1-1;
    index2 = index2-1;
    thePlayLists[index1].addSongatOne(poolSong[index2]);
  }
}
