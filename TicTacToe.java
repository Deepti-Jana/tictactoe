import java.util.Random;
import java.util.Scanner;

/**
 * TicTacToe
 * Name- Deepti Jana
 * UC3 Accept User Slot Input (1–9)
 */

public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        tossAndAssignSymbols();
        displayTossResult();

        int slot = acceptUserInput();   // UC3
        System.out.println("User selected slot: " + slot);
    }

    /**
     * UC2 Toss Logic
     */
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

        System.out.println("Enter slot number (1-9): ");

        int slot = scanner.nextInt();

        return slot;
    }
}