package dev.withajoint.yace.init;

import dev.withajoint.yace.util.Side;

public abstract class BitboardInitializer {

    private static final int NUMBER_OF_PLAYERS = 2;

    protected final long[] pawnsPositions, knightsPositions, bishopsPositions,
            rooksPositions, queenPositions, kingPositions;

    private final long[] allPiecesPositions;

    protected BitboardInitializer() {
        pawnsPositions = new long[NUMBER_OF_PLAYERS];
        knightsPositions = new long[NUMBER_OF_PLAYERS];
        bishopsPositions = new long[NUMBER_OF_PLAYERS];
        rooksPositions = new long[NUMBER_OF_PLAYERS];
        queenPositions = new long[NUMBER_OF_PLAYERS];
        kingPositions = new long[NUMBER_OF_PLAYERS];
        init();
        allPiecesPositions = new long[NUMBER_OF_PLAYERS];
        groupPiecesPositionsBySide();
    }

    protected abstract void init();

    private void groupPiecesPositionsBySide() {
        for (int side = Side.WHITE; side <= Side.BLACK; side++) {
            allPiecesPositions[side] = pawnsPositions[side] | knightsPositions[side] | bishopsPositions[side]
                    | rooksPositions[side] | queenPositions[side] | kingPositions[side];
        }
    }

    public long getPawnsPositionsAs(int side) {
        return pawnsPositions[side];
    }

    public long getKnightsPositionsAs(int side) {
        return knightsPositions[side];
    }

    public long getBishopsPositionsAs(int side) {
        return bishopsPositions[side];
    }

    public long getRooksPositionsAs(int side) {
        return rooksPositions[side];
    }

    public long getQueenPositionsAs(int side) {
        return queenPositions[side];
    }

    public long getKingPositionsAs(int side) {
        return kingPositions[side];
    }

    public long getAllPiecesPositionsAs(int side) {
        return allPiecesPositions[side];
    }
}
