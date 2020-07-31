package dev.withajoint.yace.pieces;

public class Bishop extends Piece {

    public Bishop(long bitboard) {
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
