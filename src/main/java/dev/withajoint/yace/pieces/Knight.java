package dev.withajoint.yace.pieces;

public class Knight extends Piece {

    public Knight(long bitboard) {
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
