package tic_tac_toe;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;
import static tic_tac_toe.Mark.*;

public class Main {
    private  static final Board board = new Board();
    private  static final Player player1 = new Player(X);
    private  static final Player player2 = new Player(O);
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        startTicTacToe();
    }

    private static void startTicTacToe() {
        displayBoard();
        prompt("""
                select an option.
                1.Play wit Human.
                2.Play with computer.
                3. Exit
                
                
          
              """);
        try {
            int option = input.nextInt();
            switch (option) {
                case 1 -> playWithHuman();
                case 2 -> playWithComputer();
                case 3 -> exit(3);
                default -> {
                    prompt("Invalid option! Select a valid option(1,2,3)");
                    startTicTacToe();
                }
            }
        } catch (InputMismatchException e) {
            prompt("Invalid option! Select a valid option(1,2,3)");
            input.nextLine();
            startTicTacToe();
        }

    }

    private static void playWithComputer() {

    }

    private static void playWithHuman() {
    }

    private static  void prompt(String message){
        System.out.println(message);
    }
    private  static void displayBoard(){
        board.displayBoardSurface();
    }


}
