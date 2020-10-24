/*
Gabriel Suarez
A00368589
*/

package ui;
import model.*;
import java.util.Scanner;

public class Menu{

  private Mcs myMcs = new Mcs();
  private Scanner sc = new Scanner(System.in);

  public void showMenu(){
    System.out.println("Elige la accion que deseas ejecutar");
    System.out.println("[1] Registar usuarios");
    System.out.println("[2] Ver datos de los usuarios");
    System.out.println("[3] Ingresa una cancion que desees");
    System.out.println("[4] Ver el listado de la canciones");
    System.out.println("[5] Crear una PlayList");
  }

  public int readOption(){
    int choice = sc.nextInt();
    sc.nextLine();
    return choice;
  }

  public void doOperation(int choice){
    switch (choice){
      case 1:
      addDataUser();
      break;
      case 2:
      System.out.println(myMcs.showUser());
      default:
        System.out.println("Ingresa una opcion valida");
    }
  }

  public void startProgram(){
    int option;
    do{
      showMenu();
      option = readOption();
      doOperation(option);
    } while(option != 3);
  }

  public void addDataUser(){
    if(myMcs.hasUser()){
      System.out.println("Ingresa tu nombre de usuario");
      String userName = sc.nextLine();
      System.out.println("Ingresa una contraseña segura");
      String password = sc.nextLine();
      System.out.println("Ingresa tu edad");
      int ageUser = sc.nextInt();
      myMcs.addUser(userName, password, ageUser);
    }
    else {
      System.out.println("No se pudo agregar el usuario");
    }
  }
}
