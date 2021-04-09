package org.pab2020.Theater;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Theater {
    public static void main(String [] args){
        int numberOfSeats = 20;
        List <Boolean> freeSeats = new ArrayList<>(numberOfSeats);

        //Initialize the seats

        //for (int i = 0; i < numberOfSeats; i++){
            //freeSeats.add(i, true);
        //}

        IntStream.range(0, numberOfSeats).forEach(seat -> freeSeats.add(seat, true));

        //Create the ticket offices
        int numberOfTicketOffices = 4;
        List<TicketOffice> ticketOffices = new ArrayList<>(numberOfTicketOffices);

        for (int i = 0; i < numberOfTicketOffices; i++){
            ticketOffices.add(new TicketOffice(i, freeSeats, numberOfSeats/numberOfTicketOffices));
        }

        System.out.println("Created " + ticketOffices.size());

        ticketOffices.get(0).start();
        ticketOffices.get(1).start();
        ticketOffices.get(2).start();
        ticketOffices.get(3).start();

        try{
            ticketOffices.get(0).join();
            ticketOffices.get(1).join();
            ticketOffices.get(2).join();
            ticketOffices.get(3).join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Main program ended.");
    }
}