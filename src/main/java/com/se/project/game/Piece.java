package com.se.project.game;

import java.util.Random;

public class Piece {
    private boolean isSham;

    public Piece() {
        Random random = new Random();
        isSham = random.nextBoolean();
    }

    public boolean isSham() {
        return isSham;
    }

    public void setSham(boolean sham) {
        isSham = sham;
    }
}