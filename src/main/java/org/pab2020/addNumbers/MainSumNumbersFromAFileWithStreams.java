package org.pab2020.addNumbers;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MainSumNumbersFromAFileWithStreams {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new RuntimeException("Missing argument. Usage: java MainSumNumbersFromAFile fileName");
        }

        SumTwoNumbers sumNumbers = new SumTwoNumbers() ;
        Delay delay= new Delay(5000) ;

        double total = 0 ;
        long initTime = System.currentTimeMillis();

        try {
            Stream<String> streamOfLines = Files.lines(Paths.get(args[0])) ;
            total = streamOfLines
                    .parallel()
                    .map(line -> Double.valueOf(line))
                    .reduce(0.0, (a, b) -> sumNumbers.sum(a, b, delay)) ;

        } catch (IOException e) {
            e.printStackTrace();
        }

        long computingTime = System.currentTimeMillis() - initTime ;

        System.out.println("Computing time: " + computingTime);
        System.out.println("Total sum: " + total);
    }
}