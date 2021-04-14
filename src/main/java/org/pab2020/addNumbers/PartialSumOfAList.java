package org.pab2020.addNumbers;

import java.util.List;

public class PartialSumOfAList extends Thread{
    private final List<Double> listOfNumbers;
    private int start;
    private int end;
    private Delay delay;
    private double total;

    public PartialSumOfAList(List<Double> listOfNumbers, int start, int end, Delay delay){
        this.listOfNumbers = listOfNumbers;
        this.start = start;
        this.end = end;
        this.delay = delay;
        this.total = total;
    }

    @Override
    public void run(){
        SumTwoNumbers sumNumbers = new SumTwoNumbers();
        for (int i = start; i<end; i++){
            total = sumNumbers.sum(total, listOfNumbers.get(i), delay);
        }
    }

    public double getSum(){
        return total;
    }
}
