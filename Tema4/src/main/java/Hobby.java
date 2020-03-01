import java.util.ArrayList;
import java.util.List;

public class Hobby {

    String name; //Name of hobby (String) – eq: cycling, swimming

    int frequency;  //Frequency (int) – how many times a week they practice it

    List<Adresa> adresaHobby; //List of Addresses where this hobby can be practiced (List<Adresa>)

    //
    //

    public Hobby(String name, int frequency, List<Adresa> adresaHobby) {
        this.name = name;
        this.frequency = frequency;
        this.adresaHobby = adresaHobby;

    }

    @Override
    public String toString() {
        return name + ": " + "de " + frequency + " ori pe saptamana " + adresaHobby;
    }

    public void addInAdresa(Adresa newAdresa) {

        if (!adresaHobby.contains(newAdresa)) {

            adresaHobby.add(newAdresa);
        }


    }
    public void seeListaAdresa() {
        for (Adresa newAdresa : adresaHobby) {
            if (newAdresa != null) {
                System.out.println(newAdresa);
            }

        }
    }

}