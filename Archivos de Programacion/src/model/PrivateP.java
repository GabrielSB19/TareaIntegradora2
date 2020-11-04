/*
Gabriel Suarez
A00368589
*/

package model;

public class PrivateP extends PlayList{

  /**
  *Constructor attributes to build Private PlayList type object.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private User userName1;

  /**
  *Allows to create the Private PlayList class constructor.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> The constructor has been created. <br>
  @param namePlayList name of the Private PlayList. namePlayList != "".
  @param userName1 name of the user that has acces. userName1 = an index defined in the console.
  */

  public PrivateP(String namePlayList, User userName1){
    super(namePlayList);
    this.userName1 = userName1;
  }

  /**
  *Getter of userName1 attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return userName1.
  */

  public User getUserName1(){
    return userName1;
  }

  /**
  *Setter of userName1 attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param userName1 name of the user that has acces. userName1 = an index defined in the console.
  */

  public void setUserName1(User userName1){
    this.userName1 = userName1;
  }

  /**
  *Allows to concatenate all the general and specific data of the Private Playlist for display in the console.<br>
  *<b>pre: </b> At least one user, one song and one Private PlayList must be created..<br>
  *<b>post:</b> Show general and specific data Private PlayList.<br>
  @return dataPlayList.
  */

  @Override
  public String showDatePlayList(){
    String dataPlayList = super.showDatePlayList()+"\n";
    dataPlayList += "** Duration: "+uptadeDurationFormat(uptadeDuration())+"\n";
    dataPlayList += "** Gender: "+changeGender(uptadeGender())+"\n";
    dataPlayList += "** User: "+userName1.getUserName()+"\n";
    dataPlayList += "**********************************\n";
    return dataPlayList;
  }
}
