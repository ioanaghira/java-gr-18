import java.util.Comparator;

public class ComparatorByPoints implements Comparator<Atlet> {
    @Override
    public int compare(Atlet o1, Atlet o2) {

        if (o1.getFinalTime() < (o2.getFinalTime())) {
            return -1;
        } else {
            return 1;
        }


    }
}