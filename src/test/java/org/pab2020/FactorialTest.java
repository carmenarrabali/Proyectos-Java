package org.pab2020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
 * factorial 0 -> 1
 * factorial 1 -> 1
 * factorial 2 -> 2
 * factorial 3 -> 3 * 2 = 6
 * factorial 4 -> 4 * 3 * 2 = 24
 * factorial 8 -> 40320
 * factorial -1 -> throws an exception
 */
class FactorialTest {

    private Factorial factorial;

    @BeforeEach
    public void setup(){
        factorial = new Factorial();
    }
    @Test
    public void shouldFactorialOf0Return1() {
        int result = factorial.compute(0);
        int expectedValue = 1;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf1Return1() {
        int result = factorial.compute(1);
        int expectedValue = 1;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf2Return2() {
        int result = factorial.compute(2);
        int expectedValue = 2;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf3Return6() {
        int result = factorial.compute(3);
        int expectedValue = 6;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf4Return24() {
        int result = factorial.compute(4);
        int expectedValue = 24;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf8Return40320() {
        int result = factorial.compute(8);
        int expectedValue = 40320;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOfMinusOneReturn____() {
        assertThrows(RuntimeException.class, () -> factorial.compute(-1));
    }
}