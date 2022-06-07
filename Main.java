/*
Create a Tic Tac Toe board and fill it with dashes.
Create a function that draws the board like a square.
Keep track of the player’s turn and what symbol they are using.
Keep asking the user to enter a row and col until they are valid.
Set the right position on the board to the proper symbol.
Create a function that checks if either player has won.
Check if the game has ended in a tie.
Use a loop to keep the game going.
*/

import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int boardLength = 3;
    int boardHeight = 3;
    boolean p1turn = false;
    boolean p2turn = false;
    boolean gameOver = false;
    
    System.out.println("Welcome to special tic-tac-toe!");
    System.out.println("Player one, What's your name? ");
    String playerOneName = scn.next();

System.out.println("Player two, What's your name? ");
    String playerTwoName = scn.next();
    
    introduction(scn, playerOneName, playerTwoName);
    playGame(boardLength, boardHeight, gameOver, playerOneName, playerTwoName, p1turn, p2turn, scn);
    
    
  }

  public static void introduction(Scanner scn, String playerOneName, String playerTwoName){
    System.out.println("Welcome, " + playerOneName + " and " + playerTwoName + "!");
    System.out.println("Would you like to customize settings for your tic-tac-toe game? (y/n) ");
    if (scn.next().toLowerCase().equals("y")){
      settings(scn, 3, 3);
    }
  }

  public static void settings(Scanner scn, int boardLength, int boardHeight){
    System.out.println("Pick your board length: (default is 3)");
    boardLength = scn.nextInt() - 1;
    
    System.out.println("Pick your board height: (default is 3)");
      boardHeight = scn.nextInt() - 1;
     // System.out.println(boardLength + " " + boardHeight);
  }
  public static void board(int boardLength, int boardHeight){
    System.out.println("Board:");
    char[][] board = new char[boardLength][boardHeight];

    for(int i = 0; i < boardLength; i++){
      for(int j = 0; j < boardLength; j++){
        board[i][j] = '-';
        System.out.print(board[i][j]);
      }
      System.out.println();
    }
    }
  
  public static void playGame(int boardLength, int boardHeight, boolean gameOver, String playerOneName, String playerTwoName, boolean p1turn, boolean p2turn, Scanner scn){
    // for loop: get player's input and print board
    
    while(!gameOver){
      board(boardLength, boardHeight);
      p1turn = true;
      System.out.println(playerOneName + "'s turn (x): ");
      System.out.println("Enter row number (1-" + boardLength + "): ");
      int row = scn.nextInt() - 1;
      if (row < 0 || row > boardLength - 1){
        while (row < 0 || row > boardLength - 1){
        System.out.println("Please enter a valid row number: ");
          row = scn.nextInt() - 1;
        }
      }
      System.out.println("Enter column number (1-" + boardHeight + "): ");
      int col = scn.nextInt() - 1;
      if (col < 0 || col > boardLength - 1){
        while (col < 0 || col > boardLength -1){
        System.out.println("Please enter a valid row number: ");
          col = scn.nextInt() - 1;
        }
      }
    }
  }

  
    
    
}