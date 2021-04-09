package org.pab2020;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Theater {
    public static void main(String [] args){
        int numberOfSeats = 20;
        List <Boolean> freeSeats = new ArrayList<>(numberOfSeats);

        //for (int i = 0; i < numberOfSeats; i++){
            //freeSeats.add(i, true);
        //}

        IntStream.range(0, numberOfSeats).forEach(seat -> freeSeats.add(seat, true));
    }
}
