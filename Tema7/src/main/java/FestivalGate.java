public class FestivalGate {

    private int ticket_validated;

    private int fullTicket;
    private int fullVipTicket;
    private int freePassTicket;
    private int oneDayTicket;
    private int oneDayVipTicket;



    public int getTicket_validated() {
        return ticket_validated;
    }

    public int getFullTicket() {
        return fullTicket;
    }

    public int getFullVipTicket() {
        return fullVipTicket;
    }

    public int getFreePassTicket() {
        return freePassTicket;
    }

    public int getOneDayTicket() {
        return oneDayTicket;
    }

    public int getOneDayVipTicket() {
        return oneDayVipTicket;
    }

    public void validateTicket(TicketType ticket) {

        ticket_validated++;

        switch (ticket) {
            case FULL:
                fullTicket++;
                break;
            case FULL_VIP:
                fullVipTicket++;
                break;
            case ONE_DAY:
                oneDayTicket++;
                break;
            case FREE_PASS:
                freePassTicket++;
                break;
            case ONE_DAY_VIP:
                oneDayVipTicket++;

        }


    }


}
