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
            System.out.println("Enter the row & column number space separated :");
            int x, y;

            String input = scanner.nextLine();
            String[] inputs = input.split(" ");
            x = Integer.parseInt(inputs[0]);
            y = Integer.parseInt(inputs[1]);

            // if user input was invalid
            while (!gameBoard.update(x, y, players[turn].getSymbol())) {
                System.out.println("Invalid input please try again");
                System.out.println("Enter the row & column number space separated :");


                input = scanner.nextLine();
                inputs = input.split(" ");
                x = Integer.parseInt(inputs[0]);
                y = Integer.parseInt(inputs[1]);
            }

            if (gameBoard.isWinner(players[turn].getSymbol())) {
                System.out.println("Player " + players[turn].getName() + " win");
                gameBoard.displayBoard();
                break;
            } else if (gameBoard.isDraw()) {
                System.out.println("Draw!");
                gameBoard.displayBoard();
                break;
            }

            turn = turn == 1 ? 0 : 1;
        }
    }
}
