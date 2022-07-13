package Zadanie14_1;

public class TicketController {
    public static void main(String[] args) {
        Passenger[] passengers = new Passenger[3];
        passengers[0] = new Passenger("A", "Ka");
        passengers[1] = new Passenger("B", "Ia");
        passengers[2] = new Passenger("C", "Ja");

        TicketMachine.buyTicket(passengers[0], 10);
        TicketMachine.buyTicket(passengers[1], -1);
        Passenger[] passengersNoTicket =  checkTicketValidity(passengers);
        for (Passenger passenger : passengersNoTicket) {
            System.out.println(passenger.getName() + " " + passenger.getSurname());
        }

    }
    private static Passenger[] checkTicketValidity(Passenger[] passengers) {
        int count = 0;

        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i].getTicket() == null || passengers[i].getTicket().getDuration() < 0) {
                count++;
            }
        }
        int passengerCount = 0;
        Passenger[] passengerWithOutTicket = new Passenger[count];
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i].getTicket() == null || passengers[i].getTicket().getDuration() < 0) {
                passengerWithOutTicket[passengerCount] = passengers[i];
                passengerCount++;
            }
        }
        return passengerWithOutTicket;
    }
}
