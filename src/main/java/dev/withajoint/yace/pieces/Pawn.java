package dev.withajoint.yace.pieces;

public class Pawn extends Piece {

    public Pawn(long bitboard) {
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
