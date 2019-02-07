package com.se.project.game;

public class Board {
    private Field[][] board;
    private int x;
    private int y;

    public Board(int x, int y) {
        this.x = x;
        this.y = y;
        board = new Field[x][];
        for (int i = 0; i < x; i++) {
            board[i] = new Field[y];
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = new Field(i, j);
            }
        }
    }

    public Field getField(int x, int y) {
        return board[x][y];
    }

    public void setField(int x, int y, Field field) {
        board[x][y]=field;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Field[][] getBoard() {
        return this.board;
    }
}