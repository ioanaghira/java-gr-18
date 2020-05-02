import java.util.Comparator;

public class ComparatorByNameAge implements Comparator<Persoana> {
    @Override
    public int compare(Persoana o1, Persoana o2) {
        if (o1.getName().compareTo(o2.getName()) != 0) {

            return o1.getName().compareTo(o2.getName());
        } else {

            if (o1.getName().compareTo(o2.getName()) == 0 && o1.getAge() < o2.getAge()) {
                return -1;
            } else {

                if (o1.getName().compareTo(o2.getName()) == 0 && o1.getAge() > o2.getAge()) {
                    return 1;
                } else {
                    return 0;


                }
            }

        }
    }
}




