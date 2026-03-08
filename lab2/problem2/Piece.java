package lab2.problem2;

public abstract class Piece {
    Position a;
    public Piece(Position a) {
        this.a = a;
    }
    public Piece(int x, int y) {
        this.a = new Position(x, y);
    }
    public abstract boolean isLegalMove(Position b);
}