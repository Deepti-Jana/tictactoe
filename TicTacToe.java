import java.util.Random;
import java.util.Scanner;

/**
 * TicTacToe
 * Name- Deepti Jana
 * UC4 Convert Slot Number to Row and Column
 */

public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        tossAndAssignSymbols();
        displayTossResult();

        int slot = acceptUserInput();

        int row = getRow(slot);      // UC4
        int col = getColumn(slot);   // UC4

        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
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
        int slot = scanner.nextInt();

        return slot;
    }


    static int getRow(int slot) {
        return (slot - 1) / 3;
    }

    static int getColumn(int slot) {
        return (slot - 1) % 3;
    }
}