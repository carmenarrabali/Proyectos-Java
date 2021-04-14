package org.pab2020.addNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainSumWithPartialSum {
    public static void main(String[] args) {
        final int CAPACITY = 10000;
        List<Double> listOfNumbers = new ArrayList<>(CAPACITY);

        /* 1. Initialization of the numbers */
        Random randomNumberGenerator = new Random(5);
        for (int i = 0; i < CAPACITY; i++) {
            listOfNumbers.add((double) randomNumberGenerator.nextInt(500));
        }

        /* 2. Create the delay */
        Delay delay = new Delay(10000);

        /* 3. Sum the numbers */
        PartialSumOfAList partialSumOfAList = new PartialSumOfAList(listOfNumbers, 0, listOfNumbers.size(), delay);

        long initTime = System.currentTimeMillis();

        partialSumOfAList.run();
        double sum = partialSumOfAList.getSum();

        long computingTime = System.currentTimeMillis() - initTime;
        System.out.println("Computing time: " + computingTime);
        System.out.println("Sum: " + sum);
    }
}