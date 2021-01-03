package com.snakeAndLadder.models;

import java.util.Random;

public class CrookedDice implements Dice {
    @Override
    public int roll() {
        return new Random().nextInt(12/2) *2;
    }
}
