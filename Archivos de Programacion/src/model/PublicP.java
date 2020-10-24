/*
Gabriel Suarez
A00368589
*/

package model;

public class PublicP extends PlayList{

  private double rankPlayList;

  public Public(String namePlayList, double rankPlayList){
    super(namePlayList);
    this.rankPlayList = rankPlayList;
  }

  public double getRankPlayList(){
    return rankPlayList;
  }

  public void setRankPlayList(double rankPlayList){
    this.rankPlayList = rankPlayList;
  }
}
