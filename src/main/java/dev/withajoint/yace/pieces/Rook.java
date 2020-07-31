package dev.withajoint.yace.pieces;

public class Rook extends Piece {

    public Rook(long bitboard) {
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

