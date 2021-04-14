/**
 * Created by luciaarrabali on 2021/04/14.
 */

package org.pab2020.addNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainSumWithPartialSumAndStreams {
    public static void main(String[] args) throws InterruptedException {
        final int CAPACITY = 10000;
        List<Double> listOfNumbers = new ArrayList<>(CAPACITY);

        // Step 1. Initialize the of numbers
        Random randomNumberGenerator = new Random(5);
        for (int i = 0; i < CAPACITY; i++) {
            listOfNumbers.add((double) randomNumberGenerator.nextInt(500));
        }

        // Step 2. Create the Delay
        Delay delay = new Delay(20000);

        // Step 3. Sum the numbers
        SumTwoNumbers sumTwoNumbers = new SumTwoNumbers();

        long initTime = System.currentTimeMillis();

        double sum = listOfNumbers
                .stream()
                .parallel()
                .reduce(0.0, (x, y) -> sumTwoNumbers.sum(x, y, delay)) ;

        long computingTime = System.currentTimeMillis() - initTime;

        System.out.println("Computing time: " + computingTime);
        System.out.println("Sum: " + sum);
    }
}
