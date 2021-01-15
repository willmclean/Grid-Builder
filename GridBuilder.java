
/**
 * Write a description of class GridBuilder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class GridBuilder
{
    static void clearScreen() {
        System.out.print('\u000C');
    }
    
    static String[][] buildBoard() {
        String[][] board = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = "Empty";
            }
        }
        
        return board;
    }
    
    static void printBoard(String[][] board) {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5;j++) {
                System.out.print("    " + board[i][j] + "     ");
            }
            System.out.println();
        }
        
    }
    
    static String[][] customizeBoard(String[][] board) {
        int number = 5;
        int icount = 0;
        int jcount = 0;
        Scanner key = new Scanner(System.in);
        
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    icount = i + 1;
                    jcount = j + 1;
                
                    System.out.println("Give me the value for the string in position " + icount + ", " + jcount + ": ");
                    board[icount][jcount] = key.next();
                }
            }
        
        return board;
    }
    
    static String[][] changeBoardElement(String[][] board, int x, int y) {
        Scanner key = new Scanner(System.in);
        
        System.out.println("Give the value for the string in position " + x + ", " + y + ": ");
        board[x][y] = key.next();
        
        return board;
    }
    
    public static void main(String[] args) {
        boolean playAgain = true;
        boolean fillAnElement = true;
        int x, y;
        
        int number = 5;
        String[][] myBoard = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
        
        int elementNumber;
        
        Scanner myScanner = new Scanner(System.in);
        
        do {
            clearScreen();
            
            System.out.println("There is a board to create.");
            
            myBoard = buildBoard();
            
            printBoard(myBoard);
            
            System.out.println("You will change one element. Give us the x-coordinate: ");
            x = myScanner.nextInt();
            System.out.println("Now give us the y-coordinate: ");
            y = myScanner.nextInt();
            
            changeBoardElement(myBoard, x, y);
            
            printBoard(myBoard);
            
            System.out.println("Do you want to play again?");
            playAgain = myScanner.nextBoolean();
            System.out.println("Type True to continue: ");
        } while(playAgain);
    }
}    
