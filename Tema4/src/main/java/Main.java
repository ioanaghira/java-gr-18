
import java.util.*;


public class Main {

    public static void main(String[] args) {

        ComparatorByNameAge compareByNameAge = new ComparatorByNameAge();
        TreeSet<Persoana> persoane = new TreeSet<Persoana>(compareByNameAge);

//no duplicates allowed sorted by name second criteria age

        Persoana persoana1 = new Persoana("Ioana", 15);
        Persoana persoana2 = new Persoana("Crina", 20);
        Persoana persoana3 = new Persoana("Adi", 55);
        Persoana persoana4 = new Persoana("Adi", 45);
        Persoana persoana5 = new Persoana("Ioana", 15);
        Persoana persoana6 = new Persoana("Ioana", 15);//no duplicates

        persoane.add(persoana1);
        persoane.add(persoana2);
        persoane.add(persoana3);
        persoane.add(persoana4);
        persoane.add(persoana5);

        Iterator<Persoana> iterator = persoane.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }


        List<Adresa> adresa1 = new ArrayList<Adresa>();
        List<Adresa> adresa2 = new ArrayList<Adresa>();


        ListHobby listaHobby1 = new ListHobby();
        ListHobby listaHobby2 = new ListHobby();


        Hobby hobby1 = new Hobby("ciclism", 3, adresa1);
        Hobby hobby2 = new Hobby("swiming", 4, adresa2);

        //add addresses for each hobby

        hobby1.addInAdresa(new Adresa("Romania"));
        hobby1.addInAdresa(new Adresa("Greece"));
        hobby1.addInAdresa(new Adresa("France"));
        hobby1.addInAdresa(new Adresa("Italy"));
        hobby1.addInAdresa(new Adresa("Romania"));

        hobby2.addInAdresa(new Adresa("USA"));
        hobby2.addInAdresa(new Adresa("Italy"));
        hobby2.addInAdresa(new Adresa("France"));
        hobby2.addInAdresa(new Adresa("Italy"));
        hobby2.addInAdresa(new Adresa("UK"));

        //add hobby in a list

        listaHobby1.addInHobby(hobby1);
        listaHobby1.addInHobby(hobby2);
        //listaHobby1.seeListaHobby();
        listaHobby2.addInHobby(hobby2);
        //listaHobby2.seeListaHobby();
        //hobby1.seeListaAdresa();


        //map for each person a list of hobby

        Map<Persoana, ListHobby> map1 = new HashMap<Persoana, ListHobby>();
        map1.put(persoana1, listaHobby1);
        map1.put(persoana1, listaHobby1); //no duplicates in key
        map1.put(persoana2, listaHobby2);




        Iterator<Map.Entry<Persoana, ListHobby>> it2 = map1.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<Persoana, ListHobby> pair = (Map.Entry<Persoana, ListHobby>) it2.next();

            System.out.println(pair.getKey() + "; " + pair.getValue());
        }
    }
}
