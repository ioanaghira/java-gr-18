
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AtletTest {
    private Clasament clasament;


    @Test
    void shouldCalculate10PointsPenaltyforEacho() {


        Atlet atlet = new Atlet(10, "ioana", "UK", 15.2, "xxoxx", "xoxxx", "xxxox",25);

        assertEquals(30, atlet.penalty());
    }

    @Test
    void shouldSumTimePlusPenalty() {
        Atlet atlet = new Atlet(10, "ioana", "UK", 15.2, "xxoxx", "xoxxx", "xxxox",25);
assertEquals(18.2,atlet.getFinalTime());
    }
}