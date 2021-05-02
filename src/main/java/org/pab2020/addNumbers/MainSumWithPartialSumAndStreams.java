/**
 * Created by luciaarrabali on 2021/04/14.
 */

package org.pab2020.addNumbers;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
        Delay delay = new Delay(100);

        // Step 3. Sum the numbers
        SumTwoNumbers sumTwoNumbers = new SumTwoNumbers();

        long initTime = System.currentTimeMillis();

        double sum = listOfNumbers
                .stream()
                .parallel()
                .filter(number -> number % 2 == 0)
                .reduce(0.0, (x, y) -> sumTwoNumbers.sum(x, y, delay)) ;

        double maxNumber = listOfNumbers
                .stream()
                .parallel()
                .reduce(Double.MIN_VALUE, (x, y) -> x > y ? x : y);

        List<Double> bigNumbers = listOfNumbers
                .stream()
                .filter(number -> number > 475)
                .distinct()
                .peek(i -> System.out.println(i))
                .sorted()
                .collect(Collectors.toList());



        long computingTime = System.currentTimeMillis() - initTime;

        System.out.println("Computing time: " + computingTime);
        System.out.println("Sum: " + sum);
        System.out.println("Maximum number: " + maxNumber);
        System.out.println("Big numbers: " + bigNumbers);
    }
}
