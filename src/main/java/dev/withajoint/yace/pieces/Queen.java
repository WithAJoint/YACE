package dev.withajoint.yace.pieces;

public class Queen extends Piece {

    public Queen(long bitboard) {
       super(bitboard);
    }

    @Override
    public long getPossibleMoves() {
        return 0;
    }

    @Override
    public boolean isMoveValid(String move) {
        return false;
    }
}
