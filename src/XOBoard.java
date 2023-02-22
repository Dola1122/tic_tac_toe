public class XOBoard extends Board {
    public XOBoard(int n) {
        super(n);
    }


    @Override
    public boolean isWinner(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol) {
                return true;
            }
        }
        if (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) {
            return true;
        }
        if (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isDraw() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
