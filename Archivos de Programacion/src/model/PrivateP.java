/*
Gabriel Suarez
A00368589
*/

package model;

public class PrivateP extends PlayList{

  private User userName1;

  public PrivateP(String namePlayList, User userName1){
    super(namePlayList);
    this.userName1 = userName1;
  }

  public User getUserName1(){
    return userName1;
  }

  public void setUserName1(User userName1){
    this.userName1 = userName1;
  }

  @Override
  public String showDatePlayList(){
    String dataPlayList = super.showDatePlayList()+"\n";
    dataPlayList += "** User: "+userName1.getUserName()+"\n";
    dataPlayList += "**********************************\n";
    return dataPlayList;
  }
}
