package com.snakeAndLadder;

import com.snakeAndLadder.models.Board;
import com.snakeAndLadder.models.Dice;
import com.snakeAndLadder.models.Snake;
import com.snakeAndLadder.services.SnakeAndLadderService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class SnakeAndLadderApplication {

    public static void main(String[] args) {
        int numberOfTurns = 10;
        int playerPosition;

        //create snakes for board
        List<Snake> snakeList = new LinkedList<Snake>();
        Snake snake = new Snake(14, 7);
        snakeList.add(snake);

        //create board with 0 as player initial position
        Board board = new Board(0, snakeList);
        
        //create a dice
        Dice dice = new Dice();

        //create service with created board and dice
        SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService(board, dice);

        snakeAndLadderService.start(numberOfTurns);
        playerPosition = snakeAndLadderService.result();
        System.out.println("Player position after " + numberOfTurns+ " turns: " + playerPosition);
    }

}
