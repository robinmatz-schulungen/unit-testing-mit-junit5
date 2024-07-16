package com.robinmatz.schulungen.junit5.parameterized;

public class Numbers {

    private Numbers() {
        throw new IllegalStateException("This is a utility class");
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
