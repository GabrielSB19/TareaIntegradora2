/*
Gabriel Suarez
A00368589
*/

package model;

public class User{

  /**
  *Constructor attributes to build a User type object.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private String userName;
  private String password;
  private int ageUser;
  private CategoryUser categoryUser;
  private int amountCategory;

  /**
  *Allows to create the User class constructor.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> The constructor has been created. <br>
  @param userName the user name. userName != "" and cannot have space.
  @param password the user password. password != "" and must be a string without space.
  @param ageUer the age of the user. ageUser != "" and greater than 0.
  */

  public User(String userName, String password, int ageUser){
    this.userName = userName;
    this.password = password;
    this.ageUser = ageUser;
    this.categoryUser = CategoryUser.newbie;
    this.amountCategory = amountCategory;
  }

  /**
  *Getter of UserName attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return userName.
  */

  public String getUserName(){
    return userName;
  }

  /**
  *Setter of UserName attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param name the user name. userName != "" and cannot have space.
  */

  public void setUserName(String name){
    this.userName = userName;
  }

  /**
  *Getter of password attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return password.
  */

  public String getPassword(){
    return password;
  }

  /**
  *Setter of password attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param password the user password. password != "" and must be a string without space.
  */

  public void setPassword(String password){
    this.password = password;
  }

  /**
  *Getter of ageUser attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return ageUser.
  */

  public int getAgeUser(){
    return ageUser;
  }

  /**
  *Setter of ageUser attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param ageUser the age of the user. ageUser != "" and greater than 0.
  */

  public void setAgeUser(int ageUser){
    this.ageUser = ageUser;
  }

  /**
  *Getter of categoryUser attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return categoryUser.
  */

  public CategoryUser getCategoryUser(){
    return categoryUser;
  }

  /**
  *Setter of categoryUser attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param categoryUser the user category. categoryUser = newbie, littleContributor, mildContributor or starContributor.
  */

  public void setCategoryUser(CategoryUser categoryUser){
    this.categoryUser = categoryUser;
  }

  /**
  *Getter of amountCategory attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The getter has been created.<br>
  @return amountCategory.
  */

  public int getAmountCategory(){
    return amountCategory;
  }

  /**
  *Setter of amountCategory attribute.<br>
  *<b>pre: </b> <br>
  *<b>post:</b> The setter has been created.<br>
  @param amountCategory the number of shared songs. amountCategory must be greater than 0 and less than 30.
  */

  public void setAmountCategory(int amountCategory){
    this.amountCategory = amountCategory;
  }

  /**
  *Allows to update the category of the users according to the shared songs.<br>
  *<b>pre: </b> at least one user has shared more than 3 songs and less than or equal to 30.<br>
  *<b>post:</b> the user category has been updated.<br>
  @param categoryChange the new category user. categoryChange = the method categoryChange must be nitialized in the MCS.
  @return myUserCategory.
  */

  public CategoryUser newCategory(String categoryChange){
    CategoryUser myUserCategory = CategoryUser.valueOf(categoryChange);
    return myUserCategory;
  }

  /**
  *Allows to concatenate all user data for display in the console.<br>
  *<b>pre: </b> At least one user has been created.<br>
  *<b>post:</b> Show user data.<br>
  @return dataUser.
  */

  public String showDataUser(){
    String dataUser = "************ User ************\n";
    dataUser += "** User: "+getUserName()+"\n";
    dataUser += "** Age: "+getAgeUser()+"\n";
    dataUser +="** Category:  "+getCategoryUser()+"\n";
    dataUser += "******************************\n";
    return dataUser;
  }
}
