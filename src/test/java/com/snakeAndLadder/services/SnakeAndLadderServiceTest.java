package com.snakeAndLadder.services;

import com.snakeAndLadder.models.Board;
import com.snakeAndLadder.models.Dice;
import com.snakeAndLadder.models.SimpleDice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SnakeAndLadderServiceTest {

    @Test
    public void shouldStartGame(){
        Board mockBoard = mock(Board.class);
        Dice mockDice = mock(SimpleDice.class);
        int numberOfTurns = 4;
        when(mockDice.roll()).thenReturn(numberOfTurns);
        SnakeAndLadderService snakeAndLadderService= new SnakeAndLadderService(mockBoard, mockDice);

        snakeAndLadderService.start(numberOfTurns);

        verify(mockDice, times(numberOfTurns)).roll();
        verify(mockBoard, times(numberOfTurns)).movePlayer(numberOfTurns);
    }

    @Test
    public void shouldReturnGameResult(){
        Board mockBoard = mock(Board.class);
        Dice mockDice = mock(SimpleDice.class);

        when(mockBoard.getPlayerPosition()).thenReturn(5);
        SnakeAndLadderService snakeAndLadderService= new SnakeAndLadderService(mockBoard, mockDice);

        int actualPosition = snakeAndLadderService.result();

        int expectedPosition = 5;
        verify(mockBoard, times(1)).getPlayerPosition();
        assertEquals(expectedPosition, actualPosition);
    }

}