
public class FestivalStatisticsThread extends Thread {
    FestivalGate festivalGate;

    public FestivalStatisticsThread(FestivalGate festivalGate) {
        this.festivalGate = festivalGate;
    }

    public void festivalStatistics() {
        new Thread(() -> {
            try {

                Thread.sleep(5000);

                System.out.println(festivalGate.getTicket_validated() + " people entered\n"
                        + festivalGate.getFullTicket() + " people have full tickets\n"
                        + festivalGate.getFreePassTicket() + " have free passes\n"
                        + festivalGate.getFullVipTicket() + " have full VIP passes\n"
                        + festivalGate.getOneDayVipTicket() + " have one-day VIP passes\n"
                        + festivalGate.getOneDayTicket() + " have one-day passes\n");


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();


    }
}