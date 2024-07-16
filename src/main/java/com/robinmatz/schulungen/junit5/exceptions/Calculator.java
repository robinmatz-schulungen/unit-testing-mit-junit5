package com.robinmatz.schulungen.junit5.exceptions;

public class Calculator {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("cannot divide by zero");
        }
        return a / b;
    }
}
