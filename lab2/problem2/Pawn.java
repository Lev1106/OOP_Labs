package lab2.problem2;

public class Pawn extends Piece {
    public Pawn(Position a) {
        super(a);
    }
    public Pawn(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (b.getX() == a.getX() + 1 && a.getY() == b.getY()) return true;
        if (a.getY() == b.getY() && (a.getX() == 2 || a.getX() == 7)) return b.getX() == a.getX() + 2;
        return false;
    }
}