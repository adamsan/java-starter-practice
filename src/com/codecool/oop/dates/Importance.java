package com.codecool.oop.dates;

public enum Importance {
    LOW(10), MEDIUM(30), HIGH(60);

    public final int score;

    Importance(int score) {
        this.score = score;
    }
}
