package com.snakeAndLadder.models;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    public void shouldMoveThePlayer(){
        Board board = new Board(0, new LinkedList<>());
        int diceThrowResult = 5;

        board.movePlayer(diceThrowResult);

        int expectedPosition = 5;
        assertEquals(expectedPosition, board.getPlayerPosition());
    }

    @Test
    public void shouldNotMoveThePlayerIfNewPositionIsGreaterThanBoardSize(){
        Board board = new Board( 98, new LinkedList<>());
        int diceThrowResult = 5;

        board.movePlayer(diceThrowResult);

        int expectedPosition = 98;
        assertEquals(expectedPosition, board.getPlayerPosition());
    }

    @Test
    public void shouldMoveThePlayerToTailOfSnakeIfNewPositionIsStartOfSnake(){
        Snake snake = new Snake(7, 1);
        List<Snake> snakes = new LinkedList<>();
        snakes.add(snake);
        Board board = new Board( 0, snakes);
        int diceThrowResult = 7;

        board.movePlayer(diceThrowResult);

        int expectedPosition = 1;
        assertEquals(expectedPosition, board.getPlayerPosition());
    }

}