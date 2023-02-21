abstract public class Player {
    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    abstract public void getMove(int x, int y) ;

    public String getName() {
        return this.name;
    }

    public char getSymbol() {
        return this.symbol;
    }

}
