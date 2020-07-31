package dev.withajoint.yace.init;

import dev.withajoint.yace.util.Side;

public final class StandardChessInitializer extends BitboardInitializer {

    public StandardChessInitializer() {
        super();
    }

    protected void init() {
        pawnsPositions[Side.WHITE] =
                0b00000000_00000000_00000000_00000000_00000000_00000000_11111111_00000000L;
        pawnsPositions[Side.BLACK] =
                0b00000000_11111111_00000000_00000000_00000000_00000000_00000000_00000000L;
        knightsPositions[Side.WHITE] =
                0b00000000_00000000_00000000_00000000_00000000_00000000_00000000_01000010L;
        knightsPositions[Side.BLACK] =
                0b01000010_00000000_00000000_00000000_00000000_00000000_00000000_00000000L;
        bishopsPositions[Side.WHITE] =
                0b00000000_00000000_00000000_00000000_00000000_00000000_00000000_00100100L;
        bishopsPositions[Side.BLACK] =
                0b00100100_00000000_00000000_00000000_00000000_00000000_00000000_00000000L;
        rooksPositions[Side.WHITE] =
                0b00000000_00000000_00000000_00000000_00000000_00000000_00000000_10000001L;
        rooksPositions[Side.BLACK] =
                0b10000001_00000000_00000000_00000000_00000000_00000000_00000000_00000000L;
        queenPositions[Side.WHITE] =
                0b00000000_00000000_00000000_00000000_00000000_00000000_00000000_00010000L;
        queenPositions[Side.BLACK] =
                0b00010000_00000000_00000000_00000000_00000000_00000000_00000000_00000000L;
        kingPositions[Side.WHITE] =
                0b00000000_00000000_00000000_00000000_00000000_00000000_00000000_00001000L;
        kingPositions[Side.BLACK] =
                0b00001000_00000000_00000000_00000000_00000000_00000000_00000000_00000000L;

    }

}
