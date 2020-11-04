/*
Gabriel Suarez
A00368589
*/

package model;

public class PublicP extends PlayList{

  private final static int NUM_MAX_POINTS = 10;

  private double[] average;
  public double userScore;
  private double score;
  private int count;

  public PublicP(String namePlayList){
    super(namePlayList);
    this.average = new double[NUM_MAX_POINTS];
  }

  public double[] getAverage(){
    return average;
  }

  public void setAverage(double[] average){
    this.average = average;
  }

  public void setAverage(double userScore){
    score += userScore;
    count++;
  }

  public double newAverage(){
    double theAverage = 0;
    theAverage = score;
    return theAverage/count;
  }

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
