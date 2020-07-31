package dev.withajoint.yace.pieces;

public class King extends Piece {

    public King(long bitboard) {
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
