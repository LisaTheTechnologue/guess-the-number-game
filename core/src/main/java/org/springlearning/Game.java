package org.springlearning;

public interface Game {
    int getNumber();

    int getGuess();

    int setGuess();

    int getSmallest();

    int getBiggest();

    int getRemainingGuesses();

    void reset();

    void check();

    boolean isValidNumberRange();

    boolean isGameWon();

    boolean isGameLost();
}
