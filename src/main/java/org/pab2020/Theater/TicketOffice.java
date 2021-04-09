package org.pab2020.Theater;

import java.util.List;

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
    }
}
