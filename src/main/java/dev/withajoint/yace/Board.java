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

    public Board(BitboardInitializer initializer) {
        Pawn whitePawns = new Pawn(initializer.getPawnsPositionsAs(Side.WHITE));
        Pawn blackPawns = new Pawn(initializer.getPawnsPositionsAs(Side.BLACK));
        pawns = new Pawn[]{whitePawns, blackPawns};
        Knight whiteKnights = new Knight(initializer.getKnightsPositionsAs(Side.WHITE));
        Knight blackKnights = new Knight(initializer.getKnightsPositionsAs(Side.BLACK));
        knights = new Knight[]{whiteKnights, blackKnights};
        Bishop whiteBishop = new Bishop(initializer.getBishopsPositionsAs(Side.WHITE));
        Bishop blackBishop = new Bishop(initializer.getBishopsPositionsAs(Side.BLACK));
        bishops = new Bishop[]{whiteBishop, blackBishop};
        Rook whiteRook = new Rook(initializer.getRooksPositionsAs(Side.WHITE));
        Rook blackRook = new Rook(initializer.getRooksPositionsAs(Side.BLACK));
        rooks = new Rook[]{whiteRook, blackRook};
        Queen whiteQueen = new Queen(initializer.getQueenPositionsAs(Side.WHITE));
        Queen blackQueen = new Queen(initializer.getQueenPositionsAs(Side.BLACK));
        queens = new Queen[]{whiteQueen, blackQueen};
        King whiteKing = new King(initializer.getKingPositionsAs(Side.WHITE));
        King blackKing = new King(initializer.getKingPositionsAs(Side.BLACK));
        kings = new King[]{whiteKing, blackKing};
    }

}
