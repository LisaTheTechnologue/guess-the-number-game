package org.springlearning;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {
    // fields
    public final Random random = new Random();

    public final int maxNumber = 100;

    // Implement methods
    @Override
    public int next() {
        return 0;
    }

    @Override
    public int getMaxNumber() {
        return 0;
    }
}
