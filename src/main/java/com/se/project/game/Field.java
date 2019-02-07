package com.se.project.game;

public class Field {
    private int x; // x position on the board
    private int y; // y position on the board
    private boolean isOccupied; //indicates if the field is occupied by a Player
    private boolean isDiscovered;
    private Piece piece; // a Piece placed on the field (can be null)

    public Field(int x, int y) {
        this(x, y, null);
    }

    public Field(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.piece = piece;
        this.isOccupied=false;
        this.isDiscovered=false;
    }

    public boolean hasPiece() {
        if (piece == null)
            return false;
        else
            return true;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}