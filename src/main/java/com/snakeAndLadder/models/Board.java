package com.snakeAndLadder.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Board {
    private static final int DEFAULT_BOARD_SIZE = 100;
    private int playerPosition = 0;
    private List<Snake> snakes;

    public void movePlayer(int diceThrowResult) {
        int newPosition;
        newPosition = playerPosition + diceThrowResult;

        if (newPosition > DEFAULT_BOARD_SIZE){
            newPosition = playerPosition;
        } else {
          newPosition = getNewPositionAfterGoingThroughTheSnake(newPosition);
        }

        playerPosition = newPosition;
    }

    private int getNewPositionAfterGoingThroughTheSnake(int newPosition){
        for (Snake snake: snakes) {
            if(newPosition == snake.getStartPosition()){
                newPosition = snake.getEndPosition();
            }
        }
        return newPosition;
    }
}
