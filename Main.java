import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    introduction(scn);

    int boardLength = 3;
    int boardHeight = 3;
    
    
  }

  public static void introduction(Scanner scn){
    System.out.println("Welcome to special tic-tac-toe!");
    System.out.println("What's your name? ");
    String name = scn.next();
    System.out.println("Welcome, " + name + "!");
  }
}