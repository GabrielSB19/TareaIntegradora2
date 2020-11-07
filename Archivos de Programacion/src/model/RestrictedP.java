/*
Gabriel Suarez
A00368589
*/


package model;

public class RestrictedP extends PlayList{

  /**
  *Constants to indicate the size of the arrays to be initialized.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private final static int MAX_PLAYLISTUSER = 5;

  /**
  *Constructor attributes to build Restricted PlayList type object.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private User[] usersRestrictedPlayLists = new User[MAX_PLAYLISTUSER];

  /**
  *Allows to create the Restricted PlayList class constructor.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> The constructor has been created. <br>
  @param namePlayList name of the Restricted PlayList. namePlayList != "".
  @param usersRestrictedPlayLists name of the users that have acces. usersRestrictedPlayLists = an index defined in the console.
  */

  public RestrictedP(String namePlayList, User[] usersRestrictedPlayLists){
    super(namePlayList);
    this.usersRestrictedPlayLists = usersRestrictedPlayLists;
  }

  /**
  *Getter of usersRestrictedPlayLists attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return usersRestrictedPlayLists.
  */

  public User[] getUsersRestrictedPlayList(){
    return usersRestrictedPlayLists;
  }

  /**
  *Setter of usersRestrictedPlayLists attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param usersRestrictedPlayList name of the users that have acces. usersRestrictedPlayLists = an index defined in the console.
  */

  public void setUsersRestrictedPlayList(User[] usersRestrictedPlayList){
    this.usersRestrictedPlayLists = usersRestrictedPlayLists;
  }

  /**
  *Allows to concatenate all the general and specific data of the Restricte Playlist for display in the console.<br>
  *<b>pre: </b> At least one user, one song and one Restricte PlayList must be created..<br>
  *<b>post:</b> Show general and specific data Restricte PlayList.<br>
  @return dataPlayList.
  */

  @Override
  public String showDatePlayList(){
    String dataPlayList = super.showDatePlayList()+"\n";
    dataPlayList += "** Duration: "+uptadeDurationFormat(uptadeDuration())+"\n";
    dataPlayList += "** Gender: "+changeGender(uptadeGender())+"\n";
    for(int i = 0; i<MAX_PLAYLISTUSER; i++){
      dataPlayList += "** User: "+usersRestrictedPlayLists[i].getUserName()+"\n";
    }
    dataPlayList += "**********************************\n";
    return dataPlayList;
  }
}
