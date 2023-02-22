import java.util.Scanner;

public class XOGame extends GameManager {


    public XOGame(Player[] players, Board board) {
        super(players, board);
    }

    @Override
    public void playGame() {

        int turn = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            gameBoard.displayBoard();
            System.out.println();
            System.out.println("Player " + players[turn].getName() + " turn");
            System.out.println("Enter position number from 1 : 9");
            int postion;

            String input = scanner.nextLine();
            postion = Integer.parseInt(input);

            // if user input was invalid
            while (postion < 1 || postion > 9 || !gameBoard.update(postion, players[turn].getSymbol())) {
                System.out.println("Invalid input please try again");
                System.out.println("Enter position number from 1 : 9");


                input = scanner.nextLine();
                postion = Integer.parseInt(input);
            }

            if (gameBoard.isWinner(players[turn].getSymbol())) {
                gameBoard.displayBoard();
                System.out.println("Player " + players[turn].getName() + " win");
                break;
            } else if (gameBoard.isDraw()) {
                gameBoard.displayBoard();
                System.out.println("Draw!");
                break;
            }

            turn = turn == 1 ? 0 : 1;
        }
    }
}
