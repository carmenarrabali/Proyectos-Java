/**
 * Created by luciaarrabali on 2021/04/14.
 */

package org.pab2020.addNumbers;

public class Delay {
    private int iterations;

    public Delay(int iterations) {
        this.iterations = iterations ;
    }

    public void delay() {
        for (long i = 0 ; i < iterations; i++) {
            double delay = Math.sin(i)+Math.cos(i) ;
        }
    }
}