package lab2.problem2;

import static java.lang.Math.abs;

public class Knight extends Piece {
    public Knight(Position a) {
        super(a);
    }
    public Knight(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return abs((a.getX() - b.getX()) * (a.getY() - b.getY())) == 2;
    }
}