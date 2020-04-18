package org.springlearning;

public class GameImpl implements Game {

    // fields
    public NumberGenerator numberGenerator;
    int guessCount;
    int number;

    int smallest;
    int biggest;

    int remainingGuesses;

    // Implement methods
    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public int getGuess() {
        return 0;
    }

    @Override
    public int setGuess() {
        return 0;
    }

    @Override
    public int getSmallest() {
        return 0;
    }

    @Override
    public int getBiggest() {
        return 0;
    }

    @Override
    public int getRemainingGuesses() {
        return 0;
    }

    @Override
    public void reset() {

    }

    @Override
    public void check() {

    }

    @Override
    public boolean isValidNumberRange() {
        return false;
    }

    @Override
    public boolean isGameWon() {
        return false;
    }

    @Override
    public boolean isGameLost() {
        return false;
    }
}
