package Zadanie14_1;

import java.time.LocalDateTime;

public class TicketMachine {
    public static void buyTicket(Passenger passenger, int time){
        Ticket ticket = new Ticket(LocalDateTime.now(), time);
        passenger.setTicket(ticket);
    }
}
