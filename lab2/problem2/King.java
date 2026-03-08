package lab2.problem2;

import static java.lang.Math.abs;

public class King extends Piece {
    public King(Position a) {
        super(a);
    }
    public King(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return abs(a.getX() - b.getX()) <= 1 && abs(a.getY() - b.getY()) <= 1;
    }
}