package org.pab2020;

/** Class to compute the factorial of an integer number */
public class Factorial {
    /**
     *
     * @param value
     * @return
     */
    public int compute(int value) {
        if(value < 0) {
            throw new RuntimeException("Error. Negative number: " + value);
        }

        int result = 1;
        int i=1;
        while (i <= value) {
            result *= i;
            i++;
        }
        return result;
    }
}