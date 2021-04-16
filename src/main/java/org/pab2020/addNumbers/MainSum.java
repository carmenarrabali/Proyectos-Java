/**
 * Created by luciaarrabali on 2021/04/14.
 */
package org.pab2020.addNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainSum {
    public static void main(String[] args) {
        final int CAPACITY = 10000;
        List<Double> listOfNumbers = new ArrayList<>(CAPACITY);

        /* 1. Initialization of the numbers */
        Random randomNumberGenerator = new Random(5);
        for (int i = 0; i < CAPACITY; i++) {
            double number = (double) randomNumberGenerator.nextInt(500);
            if(number % 2 == 0){
                listOfNumbers.add(number);
            }
        }

        /* 2. Create the delay */
        Delay delay = new Delay(50);

        /* 3. Sum the numbers */
        SumTwoNumbers sumTwoNumbers = new SumTwoNumbers();

        long initTime = System.currentTimeMillis();
        double sum = 0.0;
        for (double value : listOfNumbers) {
            sum = sumTwoNumbers.sum(sum, value, delay);
        }
        long computingTime = System.currentTimeMillis() - initTime;
        System.out.println("Computing time: " + computingTime);
        System.out.println("Sum: " + sum);
    }
}
