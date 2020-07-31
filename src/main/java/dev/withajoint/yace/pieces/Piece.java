package dev.withajoint.yace.pieces;

public abstract class Piece {

    protected long bitboard;

    protected Piece(long bitboard) {
        this.bitboard = bitboard;
    }

    public abstract long getPossibleMoves();

    public abstract boolean isMoveValid(String move);
}
