package org.pab2020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void shouldFibonacciOf1Return1() {
        int result = fibonacci.fibonacci(1, 1);
        int expectedValue = 1;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFibonacciOf2and1Return1() {
        int result = fibonacci.fibonacci(2, 1);
        int expectedValue = 1;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFibonacciOf5and3Return19() {
        int result = fibonacci.fibonacci(5, 3);
        int expectedValue = 19;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFibonacciOfMinusOneReturn____() {
        assertThrows(RuntimeException.class, () -> fibonacci.fibonacci(-1,-1));
    }
}