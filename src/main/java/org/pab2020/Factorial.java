package org.pab2020;

import java.math.BigInteger;

/** Class to compute the factorial of an integer number */
public class Factorial {
    /**
     *
     * @param value
     * @return
     */
    public BigInteger compute(int value) {
        BigInteger result = BigInteger.ONE;

        for (int i = value; i > 0; i--){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}