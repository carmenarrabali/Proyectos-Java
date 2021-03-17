package org.pab2020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

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
        BigInteger result = factorial.compute(0);
        BigInteger expectedValue = BigInteger.valueOf(1);

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf1Return1() {
        BigInteger result = factorial.compute(1);
        BigInteger expectedValue = BigInteger.valueOf(1);

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf2Return2() {
        BigInteger result = factorial.compute(2);
        BigInteger expectedValue = BigInteger.valueOf(2);

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf3Return6() {
        BigInteger result = factorial.compute(3);
        BigInteger expectedValue = BigInteger.valueOf(6);

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf4Return24() {
        BigInteger result = factorial.compute(4);
        BigInteger expectedValue = BigInteger.valueOf(24);

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf8Return40320() {
        BigInteger result = factorial.compute(8);
        BigInteger expectedValue = BigInteger.valueOf(40320);

        assertEquals(expectedValue, result);
    }

    public void shouldFactorialOf17Return355687428096000() {
        BigInteger result = factorial.compute(17);
        BigInteger expectedValue = new BigInteger("355687428096000");

        assertEquals(expectedValue, result);
    }

    public void shouldFactorialOf25Return15511210043330985984000000() {
        BigInteger result = factorial.compute(25);
        BigInteger expectedValue = new BigInteger("15511210043330985984000000");

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOfMinusOneReturn____() {
        assertThrows(RuntimeException.class, () -> factorial.compute(-1));
    }
}