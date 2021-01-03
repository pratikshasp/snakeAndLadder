package com.snakeAndLadder;

import com.snakeAndLadder.models.Board;
import com.snakeAndLadder.models.Dice;
import com.snakeAndLadder.services.SnakeAndLadderService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnakeAndLadderApplication {

    public static void main(String[] args) {
        int numberOfTurns = 10;
        int playerPosition;
        Board board = new Board();
        Dice dice = new Dice();
        SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService(board, dice);

        snakeAndLadderService.start(numberOfTurns);
        playerPosition = snakeAndLadderService.result();
        System.out.println("Player position after " + numberOfTurns+ " turns: " + playerPosition);
    }

}
