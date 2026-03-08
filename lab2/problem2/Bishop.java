package lab2.problem2;

import static java.lang.Math.abs;

public class Bishop extends Piece {
    public Bishop(Position a) {
        super(a);
    }
    public Bishop(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return abs(a.getX() - b.getX()) == abs(a.getY() - b.getY());
    }
}