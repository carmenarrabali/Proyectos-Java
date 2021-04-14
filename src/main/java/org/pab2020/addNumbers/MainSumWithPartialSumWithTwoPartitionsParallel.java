/**
 * Created by luciaarrabali on 2021/04/14.
 */

package org.pab2020.addNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainSumWithPartialSumWithTwoPartitionsParallel {
    public static void main(String[] args) throws InterruptedException {
        final int CAPACITY = 10000;
        List<Double> listOfNumbers = new ArrayList<>(CAPACITY);

        /* 1. Initialization of the numbers */
        Random randomNumberGenerator = new Random(5);
        for (int i = 0; i < CAPACITY; i++) {
            listOfNumbers.add((double) randomNumberGenerator.nextInt(500));
        }

        /* 2. Create the delay */
        Delay delay = new Delay(20000);

        /* 3. Sum the numbers */
        PartialSumOfAList partialSumOfAList1 = new PartialSumOfAList(listOfNumbers, 0, listOfNumbers.size() / 2, delay);
        PartialSumOfAList partialSumOfAList2 = new PartialSumOfAList(listOfNumbers, listOfNumbers.size() / 2, listOfNumbers.size(), delay);

        long initTime = System.currentTimeMillis();

        partialSumOfAList1.start();
        partialSumOfAList2.start();

        partialSumOfAList1.join();
        partialSumOfAList2.join();

        double sum = partialSumOfAList1.getSum() + partialSumOfAList2.getSum();

        long computingTime = System.currentTimeMillis() - initTime;

        System.out.println("Computing time: " + computingTime);
        System.out.println("Sum: " + sum);
    }
}