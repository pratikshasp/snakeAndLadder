package com.snakeAndLadder.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class SimpleDiceTest {

    @Test
    public void shouldRollTheDice(){
        SimpleDice dice = new SimpleDice();

        int result = dice.roll();

        assertNotNull(result);
    }
}