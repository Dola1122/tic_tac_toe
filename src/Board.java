public class Board {
    private int n;
    private char[][] grid;

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

    public void displayBoard() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public boolean isWinner(char symbol) {
        return true;
    }

    public boolean isDraw() {
        return true;
    }
}
