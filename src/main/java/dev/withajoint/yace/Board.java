package dev.withajoint.yace;

import dev.withajoint.yace.init.BitboardInitializer;
import dev.withajoint.yace.pieces.*;
import dev.withajoint.yace.util.Side;

public class Board {

    private final Pawn[] pawns;
    private final Knight[] knights;
    private final Bishop[] bishops;
    private final Rook[] rooks;
    private final Queen[] queens;
    private final King[] kings;

    private final long[] allPieces;

    public Board(BitboardInitializer initializer) {
        Pawn whitePawns = new Pawn(initializer.getPawnsPositionAs(Side.WHITE));
        Pawn blackPawns = new Pawn(initializer.getPawnsPositionAs(Side.BLACK));
        pawns = new Pawn[]{whitePawns, blackPawns};
        Knight whiteKnights = new Knight(initializer.getKnightsPositionAs(Side.WHITE));
        Knight blackKnights = new Knight(initializer.getKnightsPositionAs(Side.BLACK));
        knights = new Knight[]{whiteKnights, blackKnights};
        Bishop whiteBishops = new Bishop(initializer.getBishopsPositionAs(Side.WHITE));
        Bishop blackBishops = new Bishop(initializer.getBishopsPositionAs(Side.BLACK));
        bishops = new Bishop[]{whiteBishops, blackBishops};
        Rook whiteRooks = new Rook(initializer.getRooksPositionAs(Side.WHITE));
        Rook blackRooks = new Rook(initializer.getRooksPositionAs(Side.BLACK));
        rooks = new Rook[]{whiteRooks, blackRooks};
        Queen whiteQueen = new Queen(initializer.getQueenPositionAs(Side.WHITE));
        Queen blackQueen = new Queen(initializer.getQueenPositionAs(Side.BLACK));
        queens = new Queen[]{whiteQueen, blackQueen};
        King whiteKing = new King(initializer.getKingPositionAs(Side.WHITE));
        King blackKing = new King(initializer.getKingPositionAs(Side.BLACK));
        kings = new King[]{whiteKing, blackKing};
        long whitePieces = initializer.getPositionAs(Side.WHITE);
        long blackPieces = initializer.getPositionAs(Side.BLACK);
        allPieces = new long[]{whitePieces, blackPieces};
    }

}
