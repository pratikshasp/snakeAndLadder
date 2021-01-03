package com.snakeAndLadder.services;

import com.snakeAndLadder.models.Board;
import com.snakeAndLadder.models.Dice;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class SnakeAndLadderService {
    private Board board;
    private Dice dice;

    public void start(int numberOfTurns) {
        int diceThrowResult;

        for (int turn = 0; turn < numberOfTurns; turn++) {
            diceThrowResult = dice.roll();
            board.movePlayer(diceThrowResult);
            log.info("player position after " + turn + " turns: " + board.getPlayerPosition());
        }
    }

    public int result() {
        return board.getPlayerPosition();
    }
}
