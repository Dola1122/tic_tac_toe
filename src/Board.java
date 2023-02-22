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

    public boolean update(int userPosition, char symbol) {
        int pos = 1;
        int i = 0, j = 0;
        boolean x = true;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (userPosition == pos) {
                    x = false;
                    break;
                }
                pos++;
            }
            if (!x) {
                break;
            }
        }
        if (grid[i][j] == '-') {
            this.grid[i][j] = symbol;
            return true;
        }
        return false;
    }

    public void displayBoard() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    abstract public boolean isWinner(char symbol);

    abstract public boolean isDraw();
}
