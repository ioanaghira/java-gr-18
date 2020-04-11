public class FestivalAttendeeThread extends Thread {


    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate) {


        new Thread(() -> {

            gate.validateTicket(ticketType);
            System.out.println(currentThread().getName() + " " + ticketType);


        }).start();
    }
}
