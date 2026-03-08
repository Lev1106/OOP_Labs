package lab2.problem2;

import static java.lang.Math.abs;

public class Queen extends Piece {
    public Queen(Position a) {
        super(a);
    }
    public Queen(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return a.getX() == b.getX() || a.getY() == b.getY() || abs(a.getX() - b.getX()) == abs(a.getY() - b.getY());
    }
}