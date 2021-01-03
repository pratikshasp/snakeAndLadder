package com.snakeAndLadder.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Board {
    private static final int DEFAULT_BOARD_SIZE = 100;
    private int playerPosition = 0;

    public void movePlayer(int diceThrowResult) {
        playerPosition += diceThrowResult;

        if (playerPosition > DEFAULT_BOARD_SIZE){
            playerPosition -= diceThrowResult;
        }
    }
}
