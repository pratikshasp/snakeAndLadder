package com.snakeAndLadder.models;

import lombok.NoArgsConstructor;

import java.util.Random;

@NoArgsConstructor
public class Dice {
    public int roll() {
        return new Random().nextInt(6) + 1;
    }
}
