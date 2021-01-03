package com.snakeAndLadder.services;

import com.snakeAndLadder.models.Board;
import com.snakeAndLadder.models.Dice;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SnakeAndLadderService {
    private Board board;
    private Dice dice;

    public void start(int numberOfTurns) {

    }

    public int result() {
        return 0;
    }
}
