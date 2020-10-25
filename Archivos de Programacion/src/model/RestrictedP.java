/*
Gabriel Suarez
A00368589
*/

package model;

public class RestrictedP extends PlayList{

  private final static int MAX_PLAYLISTUSER = 5;

  private User usersRestrictedPlayLists[] = new User[MAX_PLAYLISTUSER];

  public RestrictedP(String namePlayList, User[] usersRestrictedPlayLists){
    super(namePlayList);
    this.usersRestrictedPlayLists = usersRestrictedPlayLists;
  }

  public User[] getUsersRestrictedPlayList(){
    return usersRestrictedPlayLists;
  }

  public void setUsersRestrictedPlayList(User[] userP){
    this.usersRestrictedPlayLists = usersRestrictedPlayLists;
  }

  @Override
  public String showDatePlayList(){
    String dataPlayList = super.showDatePlayList()+"\n";
    for(int i = 0; i<MAX_PLAYLISTUSER; i++){
      dataPlayList += "** User: "+usersRestrictedPlayLists[i].getUserName()+"\n";
    }
    dataPlayList += "**********************************\n";
    return dataPlayList;
  }
}
