/*
Gabriel Suarez
A00368589
*/

package ui;
import model.*;
import java.util.Scanner;

public class Menu{

  /**
  *Constants to indicate the functional requirement to be executed.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private static final int REGISTER_USER = 1;
  private static final int SEE_DATA_USER = 2;
  private static final int REGISTER_SONG = 3;
  private static final int SEE_DATA_SONG = 4;
  private static final int CREATE_PLAYLIST = 5;
  private static final int SEE_PLAYLIST = 6;
  private static final int ADD_SONG_TO_PLAYLIST = 7;


  /**
  *Initialize my objects.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */

  private Mcs myMcs = new Mcs();
  private Scanner sc = new Scanner(System.in);

  /**
  *Show the available options to execute the code.<br>
  *<b>pre: </b> <br>
  *<b>post: Show the menu.<br>
  */

  public void showMenu(){
    System.out.println("Elige la accion que deseas ejecutar");
    System.out.println("[1] Registar usuarios");
    System.out.println("[2] Ver datos de los usuarios");
    System.out.println("[3] Ingresa una cancion que desees");
    System.out.println("[4] Ver el listado de la canciones");
    System.out.println("[5] Crear una PlayList");
    System.out.println("[6] Ver el listado de la PlayList");
    System.out.println("[7] Anadir canciones a una PlayList");
  }

  /**
  *Ask the user for the option that he want to choose.<br>
  *<b>pre: </b> <br>
  *<b>post: Read the chosen option. <br>
  */

  public int readOption(){
    int choice = sc.nextInt();
    sc.nextLine();
    return choice;
  }

  /**
  *Choose the option to execute.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> called the option to execute.<br>
  */

  public void doOperation(int choice){
    switch (choice){
      case REGISTER_USER:
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
      case 5:
      addPlayList();
      break;
      case 6:
      System.out.println(myMcs.showPlayList());
      break;
      case 7:
      addSongToPlayList();
      break;
      default:
        System.out.println("Ingresa una opcion valida");
    }
  }

  /**
  *Execute the option to choose.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> execute the chosen functional requirement.<br>
  */

  public void startProgram(){
    int option;
    do{
      showMenu();
      option = readOption();
      doOperation(option);
    } while(option != 8);
  }

  /**
  *Allows to add the information to create a new user.<br>
  *<b>pre: </b> The name user must be written without space <br>
  *<b>post: </b> The new user has been created.<br>
  */

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

  /**
  *Allows to add the information to create a new song.<br>
  *<b>pre: </b> At least one user has been created.<br>
  *<b>post: </b> The new song has been created.<br>
  */

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
      System.out.print(myMcs.showNameUser());
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

  /**
  *Allows to add the information to create a new PlayList, and choose the type of PlayList.<br>
  *<b>pre: </b> At least one user and one song have been created.<br>
  *<b>post: </b> The new PlayList has been created.<br>
  */

  public void addPlayList(){
    String namePlayList = "";
    if(myMcs.hasPlayList()){
      System.out.println("Que tipo de PlayList deseas crear");
      System.out.println("[1] Publica");
      System.out.println("[2] Privada");
      System.out.println("[3] Restringida");
      int optionPlaylist = sc.nextInt();
      sc.nextLine();
      switch (optionPlaylist){
        case 1:
        System.out.println("Ingresa el nombre de tu PlayList publica");
        namePlayList = sc.nextLine();
        myMcs.addPlayListPublic(namePlayList);
        break;
        case 2:
        System.out.println("Ingresa el nombre de tu PlayList privada");
        namePlayList = sc.nextLine();
        System.out.println("Selecciona el usuario que esta creando la PlayList privada");
        System.out.print(myMcs.showNameUser());
        int indexUserPlayList = sc.nextInt();
        sc.nextLine();
        myMcs.addPlayListPriavte(namePlayList, myMcs.whoIsTheUser(myMcs.userNameIndex(indexUserPlayList)));
        break;
        case 3:
        int[] indexs = new int[5];
        System.out.println("Ingresa el nombre de tu PlayList restringida");
        namePlayList = sc.nextLine();
        System.out.println("Selecciona los usuarios que tiene acceso a esta PlayList");
        System.out.print(myMcs.showNameUser());
        for(int i = 0; i<indexs.length; i++){
          System.out.println("Seleccion el Usuario "+(1+i));
          indexs[i] = sc.nextInt()-1;
          sc.nextLine();
        }
        myMcs.addPlayListRestricted(namePlayList, myMcs.usersRestricted(indexs));
        break;
        default:
          System.out.println("No elegiste una opcion valida");
      }
    }
  }

  /**
  *Allows to add a song to the chosen PlayList.<br>
  *<b>pre: </b> At least one user has been created.<br>
  *<b>post: </b> The PlayList has been uptade with its songs.<br>
  */

  public void addSongToPlayList(){
    System.out.println("Selecciona la PlayList a la que le deseas agregar una cancion");
    System.out.print(myMcs.showPlayListNames());
    int index1 = sc.nextInt();
    sc.nextLine();
    System.out.println("Selecciona la cancion que desas agregar a tu PlayList elegida");
    System.out.print(myMcs.showSongName());
    int index2 = sc.nextInt();
    sc.nextLine();
    myMcs.addSongInThePlayList(index1, index2);
  }
}
