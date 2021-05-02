package org.pab2020.addNumbers;

import java.io.*;

public class MainSumNumbersFromAFile {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            throw new RuntimeException("Missing argument. Usage: java MainSumNumbersFromAFile fileName");
        }

        InputStream inputStream = new FileInputStream(args[0]) ;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        SumTwoNumbers sumNumbers = new SumTwoNumbers() ;
        Delay delay= new Delay(100) ;

        double total = 0.0 ;
        long initTime = System.currentTimeMillis();

        try {
            String line = bufferedReader.readLine() ;
            while (line != null) {
                total = sumNumbers.sum(total, Double.valueOf(line), delay) ;
                line = bufferedReader.readLine() ;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long computingTime = System.currentTimeMillis() - initTime ;

        System.out.println("Computing time: " + computingTime);
        System.out.println("Total sum: " + total);
    }
}
