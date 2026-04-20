import java.util.Random;

/**
 * TicTacToe
 * Name- Deepti Jana
 * UC2 performs a random toss to decide who plays first and assigns
 * symbols (X or O) to the human and computer accordingly.
 */
public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }
    static void tossAndAssignSymbols() {

        Random random = new Random();
        int toss = random.nextInt(2);   // 0 or 1

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

        if (isHumanTurn) {
            System.out.println("Human won the toss and plays first.");
        } else {
            System.out.println("Computer won the toss and plays first.");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}