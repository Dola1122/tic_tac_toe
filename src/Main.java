public class Main {
    public static void main(String[] args) {
        Board board = new XOBoard(3);
        Player[] players = {
                new XOPlayer("Ahmed", 'X'),
                new XOPlayer("Mohamed", 'O'),
        };
        GameManager game = new XOGame(players, board);
        game.playGame();
    }
}