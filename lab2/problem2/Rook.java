package lab2.problem2;

public class Rook extends Piece {
    public Rook(Position a) {
        super(a);
    }
    public Rook(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return a.getX() == b.getX() || a.getY() == b.getY();
    }
}