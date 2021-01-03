package com.snakeAndLadder.services;

import com.snakeAndLadder.models.Board;
import com.snakeAndLadder.models.Dice;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class SnakeAndLadderServiceTest {

    @Test
    public void shouldStartGame(){
        Board mockBoard = mock(Board.class);
        Dice mockDice = mock(Dice.class);
        int numberOfTurns = 4;
        when(mockDice.roll()).thenReturn(numberOfTurns);
        SnakeAndLadderService snakeAndLadderService= new SnakeAndLadderService(mockBoard, mockDice);

        snakeAndLadderService.start(numberOfTurns);

        verify(mockDice, times(numberOfTurns)).roll();
        verify(mockBoard, times(numberOfTurns)).movePlayer(numberOfTurns);
    }

}