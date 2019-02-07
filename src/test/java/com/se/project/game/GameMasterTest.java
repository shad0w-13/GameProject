package com.se.project.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameMasterTest {
    @Test
    public void BoardSizeTest() {
        GameMaster gameMaster = new GameMaster(5, 15, 0);
        assertEquals(5, gameMaster.getMainBoard().getBoard().length);
        assertEquals(15, gameMaster.getMainBoard().getBoard()[0].length);
    }
}