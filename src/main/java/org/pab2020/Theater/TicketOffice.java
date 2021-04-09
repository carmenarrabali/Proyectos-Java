package org.pab2020.Theater;

import java.util.List;

public class TicketOffice extends Thread{

    private List<Boolean> freeSeats;
    private int identifier;
    private int numberOfSeats;

    public TicketOffice(int identifier, List<Boolean> freeSeats, int numberOfSeats){
        this.identifier = identifier;
        this.freeSeats = freeSeats;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void run(){
        System.out.println("Starting ticket office " + identifier);
    }
}
