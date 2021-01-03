package com.snakeAndLadder;

import com.snakeAndLadder.models.*;
import com.snakeAndLadder.services.SnakeAndLadderService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SnakeAndLadderApplication {

    public static void main(String[] args) {
        int numberOfTurns = 10;
        int playerPosition;

        //create a board
        Board board = createBoard();

        //create a dice
        Dice dice = createDice();

        //create service with created board and dice
        SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService(board, dice);

        snakeAndLadderService.start(numberOfTurns);
        playerPosition = snakeAndLadderService.result();
        System.out.println("Player position after " + numberOfTurns+ " turns: " + playerPosition);
    }

    private static Dice createDice() {
        System.out.println("Select dice type and enter dice type index:");
        System.out.println("1 SimpleDice");
        System.out.println("2 CrookedDice");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        Dice dice;

        if (userChoice == 2)
            dice = new CrookedDice();
        else
            dice = new SimpleDice();

        return dice;
    }

    private static Board createBoard() {
        //create snakes for board
        List<Snake> snakeList = new LinkedList<Snake>();
        Snake snake = new Snake(14, 7);
        snakeList.add(snake);

        return new Board(0, snakeList);
    }

}
