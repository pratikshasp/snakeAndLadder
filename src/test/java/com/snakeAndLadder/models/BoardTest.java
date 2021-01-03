package com.snakeAndLadder.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    public void shouldMoveThePlayer(){
        Board board = new Board();
        int diceThrowResult = 5;

        board.movePlayer(diceThrowResult);

        int expectedPosition = 5;
        assertEquals(expectedPosition, board.getPlayerPosition());
    }

    @Test
    public void shouldNotMoveThePlayerIfNewPositionIsGreaterThanBoardSize(){
        Board board = new Board( 98);
        int diceThrowResult = 5;

        board.movePlayer(diceThrowResult);

        int expectedPosition = 98;
        assertEquals(expectedPosition, board.getPlayerPosition());
    }

}