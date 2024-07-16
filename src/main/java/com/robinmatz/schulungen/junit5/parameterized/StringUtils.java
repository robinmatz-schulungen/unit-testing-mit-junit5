package com.robinmatz.schulungen.junit5.parameterized;

public class StringUtils {

    private StringUtils() {
        throw new IllegalStateException("This is a utility class");
    }

    public static boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
}
