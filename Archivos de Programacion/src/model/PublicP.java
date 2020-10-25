/*
Gabriel Suarez
A00368589
*/

package model;

public class PublicP extends PlayList{

  private final static int NUM_MAX_POINTS = 10;

  private double average[] = new double[NUM_MAX_POINTS];

  public PublicP(String namePlayList){
    super(namePlayList);
    this.average = average;
  }

  public double[] getAverage(){
    return average;
  }

  public void setAverage(double[] average){
    this.average = average;
  }
}
