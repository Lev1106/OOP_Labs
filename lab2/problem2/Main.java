package lab2.problem2;

import lab2.problem5.*;

public class Main {
    public static void main(String[] args) {
        Piece rook = new Rook(1, 1);
        System.out.println(rook.isLegalMove(new Position(1, 8)));
        System.out.println(rook.isLegalMove(new Position(2, 2)));
        System.out.println(rook.isLegalMove(new Position(5, 1)));

        Piece bishop = new Bishop(3, 4);
        System.out.println(bishop.isLegalMove(new Position(1, 2)));
        System.out.println(bishop.isLegalMove(new Position(4, 3)));
        System.out.println(bishop.isLegalMove(new Position(5, 5)));

        Piece queen = new Queen(new Position(7, 2));
        System.out.println(queen.isLegalMove(new Position(1, 8)));
        System.out.println(queen.isLegalMove(new Position(7, 4)));
        System.out.println(queen.isLegalMove(new Position(6, 7)));

        Piece king = new King(new Position(6, 2));
        System.out.println(king.isLegalMove(new Position(6, 1)));
        System.out.println(king.isLegalMove(new Position(5, 3)));
        System.out.println(king.isLegalMove(new Position(6, 7)));

        Piece knight = new Knight(new Position(4, 4));
        System.out.println(knight.isLegalMove(new Position(6, 2)));
        System.out.println(knight.isLegalMove(new Position(5, 2)));
        System.out.println(knight.isLegalMove(new Position(2, 5)));

        Piece pawn = new Pawn(new Position(1, 1));
        System.out.println(pawn.isLegalMove(new Position(2, 1)));
        System.out.println(pawn.isLegalMove(new Position(3, 1)));
        System.out.println(pawn.isLegalMove(new Position(2, 2)));
    }
}