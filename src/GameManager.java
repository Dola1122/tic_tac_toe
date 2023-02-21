abstract public class GameManager {
    protected int turn;
    protected Player[] players;
    protected Board gameBoard;

    public GameManager(Player[] players, Board board) {
        this.players = players;
        this.gameBoard = board;
    }

    abstract public void playGame() ;

}
