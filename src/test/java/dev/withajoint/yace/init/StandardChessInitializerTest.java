package dev.withajoint.yace.init;

import dev.withajoint.yace.util.Side;
import org.testng.annotations.Test;

public class StandardChessInitializerTest {

    private static final int NUMBER_OF_RANKS_FROM_FIRST_TO_BLACK_PIECES = 7;
    private static final int SQUARES_PER_RANK = 8;
    private static final long FULL_FIRST_RANK = 255L;
    private static final long KNIGHTS_ON_FIRST_RANK = 66L;
    private static final long BISHOPS_ON_FIRST_RANK = 36L;
    private static final long ROOKS_ON_FIRST_RANK = 129L;
    private static final long QUEEN_ON_FIRST_RANK = 16L;
    private static final long KING_ON_FIRST_RANK = 8L;

    @Test
    public void init_whitePawnsBitboard() {
        StandardChessInitializer initializer = new StandardChessInitializer();
        long whitePawnsBitboard = initializer.getPawnsPositionAs(Side.WHITE);

        assert whitePawnsBitboard == FULL_FIRST_RANK << SQUARES_PER_RANK;
    }

    @Test
    public void init_blackPawnsBitboard() {
        int numberOfRanksFromFirstToBlackPawns = 6;
        StandardChessInitializer initializer = new StandardChessInitializer();
        long blackPawnsBitboard = initializer.getPawnsPositionAs(Side.BLACK);

        assert blackPawnsBitboard == FULL_FIRST_RANK << SQUARES_PER_RANK * numberOfRanksFromFirstToBlackPawns;
    }

    @Test
    public void init_whiteKnightsBitboard() {
        StandardChessInitializer initializer = new StandardChessInitializer();
        long whiteKnightsBitboard = initializer.getKnightsPositionAs(Side.WHITE);

        assert whiteKnightsBitboard == KNIGHTS_ON_FIRST_RANK;
    }

    @Test
    public void init_blackKnightsBitboard() {
        StandardChessInitializer initializer = new StandardChessInitializer();
        long blackKnightsBitboard = initializer.getKnightsPositionAs(Side.BLACK);

        assert blackKnightsBitboard == KNIGHTS_ON_FIRST_RANK << SQUARES_PER_RANK * NUMBER_OF_RANKS_FROM_FIRST_TO_BLACK_PIECES;
    }

    @Test
    public void init_whiteBishopsBitboard() {
        StandardChessInitializer initializer = new StandardChessInitializer();
        long whiteBishopsBitboard = initializer.getBishopsPositionAs(Side.WHITE);

        assert whiteBishopsBitboard == BISHOPS_ON_FIRST_RANK;
    }

    @Test
    public void init_blackBishopsBitboard() {
        StandardChessInitializer initializer = new StandardChessInitializer();
        long blackBishopsBitboard = initializer.getBishopsPositionAs(Side.BLACK);

        assert blackBishopsBitboard == BISHOPS_ON_FIRST_RANK << SQUARES_PER_RANK * NUMBER_OF_RANKS_FROM_FIRST_TO_BLACK_PIECES;
    }

    @Test
    public void init_whiteRooksBitboard() {
        StandardChessInitializer initializer = new StandardChessInitializer();
        long whiteRooksBitboard = initializer.getRooksPositionAs(Side.WHITE);

        assert whiteRooksBitboard == ROOKS_ON_FIRST_RANK;
    }

    @Test
    public void init_blackRooksBitboard() {
        StandardChessInitializer initializer = new StandardChessInitializer();
        long blackRooksBitboard = initializer.getRooksPositionAs(Side.BLACK);

        assert blackRooksBitboard == ROOKS_ON_FIRST_RANK << SQUARES_PER_RANK * NUMBER_OF_RANKS_FROM_FIRST_TO_BLACK_PIECES;
    }

    @Test
    public void init_whiteQueenBitboard() {
        StandardChessInitializer initializer = new StandardChessInitializer();
        long whiteQueenBitboard = initializer.getQueenPositionAs(Side.WHITE);

        assert whiteQueenBitboard == QUEEN_ON_FIRST_RANK;
    }

    @Test
    public void init_blackQueenBitboard() {
        StandardChessInitializer initializer = new StandardChessInitializer();
        long blackQueenBitboard = initializer.getQueenPositionAs(Side.BLACK);

        assert blackQueenBitboard == QUEEN_ON_FIRST_RANK << SQUARES_PER_RANK * NUMBER_OF_RANKS_FROM_FIRST_TO_BLACK_PIECES;
    }

    @Test
    public void init_whiteKingBitboard() {
        StandardChessInitializer initializer = new StandardChessInitializer();
        long whiteKingBitboard = initializer.getKingPositionAs(Side.WHITE);

        assert whiteKingBitboard == KING_ON_FIRST_RANK;
    }

    @Test
    public void init_blackKingBitboard() {
        StandardChessInitializer initializer = new StandardChessInitializer();
        long blackKingBitboard = initializer.getKingPositionAs(Side.BLACK);

        assert blackKingBitboard == KING_ON_FIRST_RANK << SQUARES_PER_RANK * NUMBER_OF_RANKS_FROM_FIRST_TO_BLACK_PIECES;
    }
}
