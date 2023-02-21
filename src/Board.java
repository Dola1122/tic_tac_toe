abstract public class Board {
    protected int n;
    protected char[][] grid;

    public Board(int n) {
        this.n = n;
        this.grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '-';
            }
        }
    }

    public void update(int x, int y, char symbol) {
        this.grid[x][y] = symbol;
    }

    abstract public boolean isEmptyCell(int x, int y);

    public void displayBoard() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" "+grid[i][j]+" ");
            }
            System.out.println();
        }
    }

    abstract public boolean isWinner(char symbol) ;

    abstract public boolean isDraw() ;
}
