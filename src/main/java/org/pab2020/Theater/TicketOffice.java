package org.pab2020.Theater;

import java.util.List;
import java.util.Random;

public class TicketOffice extends Thread{

    private List<Boolean> freeSeats;
    private int identifier;
    private int numberOfSeatsToSell ;

    public TicketOffice(int identifier, List<Boolean> freeSeats, int numberOfSeatsToSell){
        this.identifier = identifier;
        this.freeSeats = freeSeats;
        this.numberOfSeatsToSell = numberOfSeatsToSell;
    }

    @Override
    public void run(){
        System.out.println("Starting ticket office " + identifier);
        for (int i = 0; i < numberOfSeatsToSell; i++) {
            System.out.println(identifier + ": " + i);
        }

        Random random = new Random();

        int numberOfSoldSeats = 0;
        while(numberOfSoldSeats < numberOfSeatsToSell){
            int selectedSeat = random.nextInt(freeSeats.size());
            if(freeSeats.get(selectedSeat)){
                freeSeats.set(selectedSeat, false);
                numberOfSoldSeats++;
            }
            //Issue ticket
        }
    }
}
