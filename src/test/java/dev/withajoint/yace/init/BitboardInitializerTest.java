package dev.withajoint.yace.init;

import dev.withajoint.yace.util.Side;
import org.testng.annotations.Test;

public class BitboardInitializerTest {

    @Test
    public void groupPiecesPositions_returnBitboardShowingAllWhitePieces() {
        BitboardInitializer initializer = new BitboardInitializer() {
            @Override
            protected void init() {
                pawnsPositions[Side.WHITE] = 0b00000001;
                knightsPositions[Side.WHITE] = 0b00000010;
                bishopsPositions[Side.WHITE] = 0b00000100;
                rooksPositions[Side.WHITE] = 0b00001000;
                queenPositions[Side.WHITE] = 0b00010000;
                kingPositions[Side.WHITE] = 0b00100000;
            }
        };

        long whitePieces = initializer.getAllPiecesPositionsAs(Side.WHITE);

        assert whitePieces == 0b00111111;
    }

    @Test
    public void groupPiecesPositions_returnBitboardShowingAllBlackPieces() {
        BitboardInitializer initializer = new BitboardInitializer() {
            @Override
            protected void init() {
                pawnsPositions[Side.BLACK] = 0b00000000;
                knightsPositions[Side.BLACK] = 0b00000010;
                bishopsPositions[Side.BLACK] = 0b00000100;
                rooksPositions[Side.BLACK] = 0b00001000;
                queenPositions[Side.BLACK] = 0b00010000;
                kingPositions[Side.BLACK] = 0b00100000;
            }
        };

        long blackPieces = initializer.getAllPiecesPositionsAs(Side.BLACK);

        assert blackPieces == 0b00111110;
    }
}
