/**
 * TicTacToe
 * Name- Deepti Jana 
 * UC1 initializes and displays an empty Tic-Tac-Toe board in a proper
 * grid format. This use case introduces 2D arrays, nested loops,
 * and formatted console output.
 */

public class TicTacToe {

    static char[][] board = new char[3][3];

    
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
    }

    
    static void initializeBoard() {

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    static void printBoard() {

        System.out.println("-------------");

        for (int row = 0; row < 3; row++) {

            System.out.print("| ");

            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }

            System.out.println();
            System.out.println("-------------");
        }
    }
}