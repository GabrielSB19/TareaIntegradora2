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
      break;
      case 3:
      addDataSong();
      break;
      case 4:
      System.out.println(myMcs.showSong());
      break;
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
    } while(option != 5);
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

  public void addDataSong(){
    if(myMcs.hasSong()){
      System.out.println("Ingresa el nombre de la cancion");
      String tittleSong = sc.nextLine();
      System.out.println("Ingresa el nombre del artista que escribio la cancion");
      String artistName = sc.nextLine();
      System.out.println("Ingresa la fecha de lanzamiento de tu cancion");
      System.out.println("recuerda que le formato es DD/MM/AA");
      String realaseDateSong = sc.nextLine();
      System.out.println("Ingresa la duaracion de la cancion:");
      System.out.println("Ingresa los minutos de duracion");
      int minutes = sc.nextInt();
      System.out.println("Ingresa los segundos restantes");
      int seconds = sc.nextInt();
      System.out.println("Ingresa el genero de la cancion en base a los siguiente");
      System.out.println("[1] Rock");
      System.out.println("[2] HipHop");
      System.out.println("[3] Musica Clasica");
      System.out.println("[4] Raggae");
      System.out.println("[5] Salsa");
      System.out.println("[6] Metal");
      String genderSong = "";
      int optionGender = sc.nextInt();
      switch(optionGender){
        case 1:
        genderSong = "ROCK";
        break;
        case 2:
        genderSong = "HIPHOP";
        break;
        case 3:
        genderSong = "MUSICACLASICA";
        break;
        case 4:
        genderSong = "RAGGAE";
        break;
        case 5:
        genderSong = "SALSA";
        break;
        case 6:
        genderSong = "METAL";
        break;
        default:
          System.out.println("Ingresaste un valor equivocado");
          optionGender = sc.nextInt();
      }
      System.out.println("Selecciona el usuario que agrega la cancion");
      System.out.println(myMcs.showNameUser());
      int index = sc.nextInt();
      myMcs.userIndex(index);
      myMcs.changeCategory(index-1);
      myMcs.addSongPool(tittleSong, artistName, realaseDateSong, minutes, seconds, genderSong);
      System.out.println("La cancion se ha agregado correctamente");
    }
    else {
      System.out.println("No se ha agregado la cancion debido a que se ha excedido el numero de canciones permitidas");
    }
  }
}
