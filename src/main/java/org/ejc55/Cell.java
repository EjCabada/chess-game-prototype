package org.ejc55;

public class Cell {
    private GamePiece piece;
    private boolean occupied;

    public Cell() {
        this.piece = new EmptyPiece();
    }

    public Cell(GamePiece piece) {
        this.piece = piece;
    }

    public String getPieceObj() {
        return piece.getObj();
    }

    public GamePiece getPiece() {
        return piece;
    }

    public void changePiece(GamePiece piece) {
        this.piece = piece;
        if (piece.getObj().equals("•")) {
            occupied = false;
        } else {
            occupied = true;
        }
    }
}
