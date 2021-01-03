package com.snakeAndLadder.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class DiceTest {

    @Test
    public void shouldRollTheDice(){
        Dice dice = new Dice();

        int result = dice.roll();

        assertNotNull(result);
    }
}