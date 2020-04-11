public class Main {

    public static void main(String[] args) {

        FestivalGate mainGate = new FestivalGate();


        for (int i = 0; i < 10; i++) {

            TicketType ticketType = TicketType.generateRandomTicket();

            new FestivalAttendeeThread(ticketType, mainGate);
        }

        new FestivalStatisticsThread(mainGate).festivalStatistics();


    }
}
