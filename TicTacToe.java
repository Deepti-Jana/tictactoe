import java.util.Random;
import java.util.Scanner;

/**
 * TicTacToe
 * Name- Deepti Jana
 * UC5 Validate User Move
 */

public class TicTacToe {

    static char[][] board = new char[3][3];

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        initializeBoard();

        tossAndAssignSymbols();
        displayTossResult();

        int slot = acceptUserInput();

        int row = getRow(slot);
        int col = getColumn(slot);

        if (validateMove(row, col)) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }
    }

    static void initializeBoard() {

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    static void tossAndAssignSymbols() {

        Random random = new Random();
        int toss = random.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {

        System.out.println("===== Toss Result =====");

        if (isHumanTurn)
            System.out.println("Human plays first");
        else
            System.out.println("Computer plays first");

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }

    static int acceptUserInput() {

        System.out.print("Enter slot number (1-9): ");
        return scanner.nextInt();
    }

    static int getRow(int slot) {
        return (slot - 1) / 3;
    }

    static int getColumn(int slot) {
        return (slot - 1) % 3;
    }

    static boolean validateMove(int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}