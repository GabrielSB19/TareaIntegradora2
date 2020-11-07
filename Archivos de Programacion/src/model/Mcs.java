/*
Gabriel Suarez
A00368589
*/


package model;

public class Mcs{

  /**
  *Constants to indicate the size of the arrays to be initialized.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private static final int MAX_USER = 10;
  private static final int MAX_SONG = 30;
  private static final int MAX_PLAYLIST = 20;

  /**
  *Variables to keep track of how many objects I have created.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private int numUser;
  private int numSongs;
  private int numPlayList;

  /**
  *Variables for initializing the necessary arrangements.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private User[] user;
  private Song[] poolSong;
  private PlayList[] thePlayLists;
  private double[] score;
  private PlayList[] onlyPublic;

  /**
  *Allows to create the Mcs class constructor.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> The constructor has been created. <br>
  */

  public Mcs(){
    user = new User[MAX_USER];
    poolSong = new Song[MAX_SONG];
    thePlayLists = new PlayList[MAX_PLAYLIST];
    numUser = 0;
    numSongs = 0;
    numPlayList = 0;
  }

  /**
  *Allows to create the new Object of the class User.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> The User object has been created.<br>
  @param userName the user name. userName != "" and cannot have space
  @param password the user password. password != "" and must be a string without space
  @param ageUser the age of the user. ageUser != "" and greater than 0
  @return user.
  */

  public User[] addUser(String userName, String password, int ageUser){
    boolean space = false;
    for(int i = 0; i<MAX_USER && !space; i++){
      if(user[i] == null){
        user[i] = new User(userName, password, ageUser);
        space = true;
        numUser++;
      }
    }
    return user;
  }

  /**
  *Allows to know how many user objects i have created.<br>
  *<b>pre: </b> The method called addUser must be initialized .<br>
  *<b>post: </b> the amount of my user objects.<br>
  @return If numUser is less than MAX_USER is true, if not is false.
  */

  public boolean hasUser(){
    return numUser < MAX_USER;
  }

  /**
  *Allows to show the data of the each user created.<br>
  *<b>pre: </b> The methods called as addUser, addDataUser must be initialized and at least one user created.<br>
  *<b>post: </b> Showing the information of the user in the requerid format.<br>
  @return dataUser.
  */

  public String showUser(){
    String dataUser = "";
    for(int i = 0; i<MAX_USER; i++){
      if(user[i] != null){
        dataUser += user[i].showDataUser();
      }
    }
    return dataUser;
  }

  /**
  *Allows to create the new Object of the class Song.<br>
  *<b>pre: </b> There muste be at least one User to create songs.<br>
  *<b>post: </b> The song has been created.<br>
  @param tittleSong tittle of the song. tittleSong != "" and must be a string.
  @param artistName name of the artist. artistName != "" and must be a string.
  @param realaseDateSong release date of the song. realaseDateSong != "" and in the format DD/MM/AA.
  @param minutes minutes of the song. minutes = greater than zero.
  @param seconds seconds of the song. seconds = greater than zero and less than sixty.
  @param genderSong gender of the song. genderSong = must be one element from the Gender class.
  @return poolSong.
  */

  public Song[] addSongPool(String tittleSong, String artistName, String realaseDateSong, int minutes, int seconds, String genderSong){
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
    return poolSong;
  }

  /**
  *Allows to know how many poolSong objects i have created.<br>
  *<b>pre: </b> The method called addSong must be initialized .<br>
  *<b>post: </b> the amount of my poolSong objects.<br>
  @return If numSongs is less than MAX_SONG is true, if not is false.
  */

  public boolean hasSong(){
    return numSongs < MAX_SONG;
  }

  /**
  *Allows to show the data of the each song created.<br>
  *<b>pre: </b> The methods called as addSong, addDataUser must be initialized and at least one song created.<br>
  *<b>post: </b> Showing the information of the song in the requerid format.<br>
  @return dataSong;
  */

  public String showSong(){
    String dataSong ="";
    for(int i = 0; i<MAX_SONG; i++){
      if(poolSong[i] != null){
        dataSong += poolSong[i].showDataSong();
      }
    }
    return dataSong;
  }

  /**
  *Allows to show the name of the each user.<br>
  *<b>pre: </b> The methods called as addSong, addDataUser must be initialized, at least one song created and one user.<br>
  *<b>post: </b> Showing the information of the user name.<br>
  @return nameUsertoSong.
  */

  public String showNameUser(){
    String nameUsertoSong = "";
    for(int i = 0; i<MAX_USER; i++){
      if(user[i] != null){
        nameUsertoSong += "["+(i+1)+"]"+user[i].getUserName()+"\n";
      }
    }
    return nameUsertoSong;
  }

  /**
  *Allows to know which user adds a song to change its category.<br>
  *<b>pre: </b> The methods called as addSong, addDataUser must be initialized, at least one song created and one user.<br>
  *<b>post: </b> The user that created the song.<br>
  @param namePosicion posicion of the user in the array. namePoscion = greater than 0 and less than ten.
  @return index
  */

  public int userIndex(int namePosicion){
    int index = namePosicion -1;
    user[index].setAmountCategory(user[index].getAmountCategory()+1);
    return index;
  }

  /**
  *Allows to change the user category according to the number of songs created.<br>
  *<b>pre: </b> The user must have created a song.<br>
  *<b>post: </b> The category user has been changed.<br>
  @param index index of the user. index = greater than 0 and less than ten.
  */

  public void changeCategory(int index){
    if(user[index].getAmountCategory()>=3 && user[index].getAmountCategory()<=10){
      user[index].setCategoryUser(user[index].newCategory("littleContributor"));
    }
    else if(user[index].getAmountCategory()>10 && user[index].getAmountCategory()<30){
      user[index].setCategoryUser(user[index].newCategory("mildContributor"));
    }
    else if(user[index].getAmountCategory() == 30){
      user[index].setCategoryUser(user[index].newCategory("starContributor"));
    }
  }

  /**
  *Allows to create a public PlayList.<br>
  *<b>pre: </b> Must exister at least one user and one song.<br>
  *<b>post: </b> The public PlayList has been created.<br>
  @param namePlayList name of the public PlayList. namePlayList != "".
  @return thePlayLists.
  */

  public PlayList[] addPlayList(String namePlayList){
    boolean space2 = false;
    for(int i = 0; i<MAX_PLAYLIST && !space2; i++){
      if(thePlayLists[i] == null){
        PlayList publicPlayList = new PublicP(namePlayList);
        thePlayLists[i] = publicPlayList;
        numPlayList++;
        space2 = true;
      }
    }
    return thePlayLists;
  }

  /**
  *Allows to create a private PlayList.<br>
  *<b>pre: </b> Must exister at least one user and one song.<br>
  *<b>post: </b> The private PlayList has been created.<br>
  @param namePlayList name of the private PlayList. namePlayList != ""
  @param userName1 name of the user who has access to the playlist. userName1 != null
  @return thePlayLists.
  */

  public PlayList[] addPlayList(String namePlayList, User userName1){
    boolean space3 = false;
    for(int i = 0; i<MAX_PLAYLIST && !space3; i++){
      if(thePlayLists[i] == null){
        PlayList privatePlayList = new PrivateP(namePlayList, userName1);
        thePlayLists[i] = privatePlayList;
        numPlayList++;
        space3 = true;
      }
    }
    return thePlayLists;
  }

  /**
  *Allows to create a restricted PlayList.<br>
  *<b>pre: </b> Must exister at least five user and one song.<br>
  *<b>post: </b> The restricted PlayList has been created.<br>
  @param namePlayList name of the restricted PlayList. namePlayList != ""
  @param usersRestrictedPlayLists name of the users who have access to the playlis. usersRestrictedPlayLists != null and = 5
  @return thePlayLists.
  */

  public PlayList[] addPlayList(String namePlayList, User[] usersRestrictedPlayLists){
    boolean space4 = false;
    for(int i = 0; i<MAX_PLAYLIST && !space4; i++){
      if(thePlayLists[i] == null){
        PlayList restritecPlayList = new RestrictedP(namePlayList, usersRestrictedPlayLists);
        thePlayLists[i] = restritecPlayList;
        numPlayList++;
        space4 = true;
      }
    }
    return thePlayLists;
  }

  /**
  *Allows to know how many PlayList objects i have created.<br>
  *<b>pre: </b> The method called addPlayList, addPlayListPublic, addPlayListPriavte or addPlayListRestricted must be initialized .<br>
  *<b>post: </b> the amount of my playlist objects.<br>
  @return If numPlayList is less than MAX_PLAYLIST is true, if not is false.
  */

  public boolean hasPlayList(){
    return numPlayList < MAX_PLAYLIST;
  }

  /**
  *Allows to show the data of the each playlist created.<br>
  *<b>pre: </b> The methods called as addPlayList, addPlayListPublic, addPlayListPriavte or addPlayListRestricted must be initialized and at least one song created.<br>
  *<b>post: </b> Showing the information of the playlist in the requerid format.<br>
  @return dataPlayList.
  */

  public String showPlayList(){
    String dataPlayList = "";
    for(int i = 0; i<MAX_PLAYLIST; i++){
      if(thePlayLists[i] != null){
        thePlayLists[i].uptadeDurationFormat(thePlayLists[i].uptadeDuration());
        thePlayLists[i].changeGender(thePlayLists[i].uptadeGender());
        dataPlayList += thePlayLists[i].showDatePlayList();
      }
    }
    return dataPlayList;
  }

  /**
  *Allows to know which user adds a playlist.<br>
  *<b>pre: </b> The methods called as addPlayList, addPlayListPriavte must be initialized, at least one private PlayList created and one user.<br>
  *<b>post: </b> The index of the user that created the private playlist.<br>
  @param  index index of the user that created the private playlist. index = greater than 0 and less than ten.
  @return userName1
  */

  public String userNameIndex(int index){
    index = index-1;
    String userName1 = "";
    userName1 = user[index].getUserName();
    return userName1;
  }

  /**
  *Allows to compare the position of the user who created the private PlayList with your index.<br>
  *<b>pre: </b> The methods called as addPlayList, addPlayListPriavte must be initialized, at least one private PlayList created and one user.<br>
  *<b>post: </b> The user that created the private playlist.<br>
  @param  name name of the user that created the private playlist. name != ""
  @return userPrivate.
  */

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

  /**
  *Allows to know which users have access to the restricted playlist.<br>
  *<b>pre: </b> The methods called as addPlayList, addPlayListRestricted must be initialized, at least one private PlayList created and five user.<br>
  *<b>post: </b> which users can watch the playlist restricted.<br>
  @param  indexs posicion of the user that can watch the restricted playlist. indexs != "" and indexs  greater than 0 and less than 5
  @return usersRestrictedPlayList.
  */

  public User[] usersRestricted(int[] indexs){
    User[] usersRestrictedPlayLists = new User[5];
    for(int i = 0; i<5; i++){
      usersRestrictedPlayLists[i] = user[indexs[i]];
    }
    return usersRestrictedPlayLists;
  }

  /**
  *Show the name available PlayList.<br>
  *<b>pre: </b> Must exister at least one playlist and one song.<br>
  *<b>post: </b> The name of all playlist.<br>
  @return namePlayList.
  */

  public String showPlayListNames(){
    String namePlayList = "";
    for(int i = 0; i<MAX_PLAYLIST; i++){
      if(thePlayLists[i] != null){
        namePlayList += "["+(i+1)+"]"+thePlayLists[i].getNamePlayList()+"\n";
      }
    }
    return namePlayList;
  }

  /**
  *Show the name of the song created.<br>
  *<b>pre: </b> Must exister at least one playlist and one song.<br>
  *<b>post: </b> The name of all songs.<br>
  @return nameSong.
  */

  public String showSongName(){
    String nameSong = "";
    for (int i = 0; i<MAX_SONG; i++){
      if(poolSong[i] != null){
        nameSong += "["+(i+1)+"]"+poolSong[i].getTittleSong()+"\n";
      }
    }
    return nameSong;
  }

  /**
  *Allows add a song to the chosen playlist.<br>
  *<b>pre: </b> At leats one song and one playlist must exister.<br>
  *<b>post: </b> The song has been added to the PlayList.<br>
  @param index1 posicion of the playlists. index1 = between one and the number of playlists created
  @param index2 posicion of songs. index1 = between one and the number of songs
  */

  public void addSongInThePlayList(int index1, int index2){
    index1 = index1-1;
    index2 = index2-1;
    thePlayLists[index1].addSongatOne(poolSong[index2]);
  }

  /**
  *Show the name of the public PlatList.<br>
  *<b>pre: </b> Must exister at least one public playlist.<br>
  *<b>post: </b> The name of all public PlayList.<br>
  @return playListPublic.
  */

  public String showPlayListPublic(){
    String playListPublic = "";
    int posicion = 0;
    for(int i = 0; i<MAX_PLAYLIST; i++){
      if(thePlayLists[i] != null){
        if(thePlayLists[i] instanceof PublicP){
          playListPublic += "["+(posicion+1)+"]"+thePlayLists[i].getNamePlayList()+"\n";
          posicion++;
        }
      }
    }
    return playListPublic;
  }

  public PlayList[] onlyPublicPlayList(){
    onlyPublic = new PlayList[MAX_PLAYLIST];
    int posicionPublic = 0;
    for(int i = 0; i<MAX_PLAYLIST; i++){
      if(thePlayLists[i] instanceof PublicP){
        if(onlyPublic[i] == null){
          onlyPublic[posicionPublic] = thePlayLists[i];
          posicionPublic++;
        }
      }
    }
    return onlyPublic;
  }

  public void scoreUptadeInThePlayList(PlayList[] onlyPublic, int index, double score){
    boolean space8 = false;
    for(int i = 0; i<onlyPublic.length && !space8; i++){
      PlayList var = null;
      if(onlyPublic[index].getNamePlayList().equals(thePlayLists[i].getNamePlayList())){
        var = thePlayLists[i];
        ((PublicP) var).setAverage(score);
        space8 = true;
      }
    }
  }
}
