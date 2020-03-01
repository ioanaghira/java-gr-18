import java.util.ArrayList;
import java.util.List;

public class ListHobby {

    List<Hobby> listaHobby = new ArrayList<Hobby>();


    public void addInHobby(Hobby newHobby) {


        if (!listaHobby.contains(newHobby)) {

            listaHobby.add(newHobby);
        }

    }

    public void seeListaHobby() {
        for (Hobby newHobby : listaHobby) {
            if (newHobby != null) {
                System.out.println(newHobby);
            }

        }
    }

    @Override
    public String toString() {
        return "listaHobby: " + listaHobby;
    }
}
