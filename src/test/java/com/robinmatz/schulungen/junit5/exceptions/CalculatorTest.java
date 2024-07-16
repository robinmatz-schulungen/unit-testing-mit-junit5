package com.robinmatz.schulungen.junit5.exceptions;

import com.robinmatz.schulungen.junit5.exceptions.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    // Alte Version mit Try Catch
    @Test
    void testDivisionByZeroThrowsIllegalArgumentException_TryCatch() {

        // When
        try {
            calculator.divide(1, 0);
        }
        // Then
        catch (IllegalArgumentException e) {
            assertEquals("cannot divide by zero", e.getMessage());
        }
    }

    @Test
    void testDivisionByZeroThrowsIllegalArgumentException_AssertThrows() {
        // When
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));

        // Then
        assertEquals("cannot divide by zero", e.getMessage());

    }

}