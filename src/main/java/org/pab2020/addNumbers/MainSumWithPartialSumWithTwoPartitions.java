/**
 * Created by luciaarrabali on 2021/04/14.
 */

package org.pab2020.addNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainSumWithPartialSumWithTwoPartitions {
    public static void main(String[] args) {
        final int CAPACITY = 10000;
        List<Double> listOfNumbers = new ArrayList<>(CAPACITY);

        // Step 1. Initialize the of numbers
        Random randomNumberGenerator = new Random(5);
        for (int i = 0; i < CAPACITY; i++) {
            listOfNumbers.add((double) randomNumberGenerator.nextInt(500));
        }

        // Step 2. Create the Delay
        Delay delay = new Delay(10000);

        // Step 3. Sum the numbers
        PartialSumOfAList partialSum1 = new PartialSumOfAList(listOfNumbers,0, listOfNumbers.size()/2, delay) ;
        PartialSumOfAList partialSum2 = new PartialSumOfAList(listOfNumbers,listOfNumbers.size()/2, listOfNumbers.size(), delay) ;

        long initTime = System.currentTimeMillis();
        partialSum1.run();
        partialSum2.run();
        double sum = partialSum1.getSum() + partialSum2.getSum();
        long computingTime = System.currentTimeMillis() - initTime;

        System.out.println("Computing time: " + computingTime);
        System.out.println("Sum: " + sum);
    }
}