import java.util.Random;

/**
 * TicketType ticketType = // this should be enum value randomly generated.
 */

public enum TicketType {

    FULL,
    FULL_VIP,
    FREE_PASS,
    ONE_DAY,
    ONE_DAY_VIP;


    public static TicketType generateRandomTicket() {

        return TicketType.values()[new Random().nextInt(values().length)];

    }
}
