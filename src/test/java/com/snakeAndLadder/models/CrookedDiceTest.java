package com.snakeAndLadder.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrookedDiceTest {

    @Test
    public void shouldRollTheDice(){
        CrookedDice dice = new CrookedDice();

        int result = dice.roll();

        assertEquals(0, result%2);
    }

}