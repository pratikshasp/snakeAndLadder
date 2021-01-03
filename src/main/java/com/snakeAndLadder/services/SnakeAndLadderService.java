package com.snakeAndLadder.services;

import com.snakeAndLadder.models.Board;
import com.snakeAndLadder.models.Dice;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SnakeAndLadderService {
    private Board board;
    private Dice dice;

    public void start(int numberOfTurns) {
        int diceThrowResult;

        for (int turn = 0; turn < numberOfTurns; turn++) {
            diceThrowResult = dice.roll();
            board.movePlayer(diceThrowResult);
        }
    }

    public int result() {
        return 0;
    }
}
