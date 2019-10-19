package com.chess.engine.board;

public class BoardUtils {

    public static final boolean[] FIRST_COLUMN = null;
    public static final boolean[] SECOND_COLUMN = null;

    private BoardUtils(){
        throw new RuntimeException("you cannot instantiate this!");
    }
    public static boolean isValidTileCoordinate(int coordinate) {
        return coordinate>=0&&coordinate<64;
    }
}
