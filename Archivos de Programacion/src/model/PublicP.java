/*
Gabriel Suarez
A00368589
*/

package model;

public class PublicP extends PlayList{

  /**
  *Constants to indicate the size of the arrays to be initialized.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private final static int NUM_MAX_POINTS = 10;

  /**
  *Constructor attributes and variables to build Public PlayList type object.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private double[] average;
  public double userScore;
  private double score;
  private int count;

  /**
  *Allows to create the Public PlayList class constructor.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> The constructor has been created. <br>
  @param namePlayList name of the Restricted PlayList. namePlayList != "".
  */

  public PublicP(String namePlayList){
    super(namePlayList);
    this.average = new double[NUM_MAX_POINTS];
  }

  /**
  *Getter of average attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return average.
  */

  public double[] getAverage(){
    return average;
  }

  /**
  *Setter of average attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param average average of the public PlayLis. average = an boolean greater than 0.
  */

  public void setAverage(double[] average){
    this.average = average;
  }

  /**
  *Setter of average attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param userScore rating of a user. userScore = an boolean greater than 0.
  */

  public void setAverage(double userScore){
    score += userScore;
    count++;
  }

  /**
  *Allows to calculate the average score of a public playlist.<br>
  *<b>pre: </b> At least one user and one Public PlayList have been created. <br>
  *<b>post:</b> the average has been uptade.<br>
  @return theAverage divided count.
  */

  public double newAverage(){
    double theAverage = 0;
    theAverage = score;
    return theAverage/count;
  }

  /**
  *Allows to concatenate all the general and specific data of the Public Playlist for display in the console.<br>
  *<b>pre: </b> At least one user, one song and one Restricte PlayList must be created..<br>
  *<b>post:</b> Show general and specific data Restricte PlayList.<br>
  @return dataPlayList.
  */

  @Override
  public String showDatePlayList(){
    String dataPlayList = super.showDatePlayList()+"\n";
    dataPlayList += "** Duration: "+uptadeDurationFormat(uptadeDuration())+"\n";
    dataPlayList += "** Gender: "+changeGender(uptadeGender())+"\n";
    dataPlayList += "** Score: "+newAverage()+"\n";
    dataPlayList += "**********************************\n";
    return dataPlayList;
  }
}
