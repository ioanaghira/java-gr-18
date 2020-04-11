import java.io.*;
import java.util.Collections;
import java.util.List;

public class Clasament {

    public void clasament() {

        String fileName = "atleti.csv";

        AtletReaderCSV atletReaderCSV = new AtletReaderCSV();
        List<Atlet> atletList = atletReaderCSV.readAtlet(fileName);


        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("atlet.obj"));

            objectOutputStream.writeObject(atletList.get(1));
            objectOutputStream.flush();
            objectOutputStream.close();

            // Client
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream("atlet.obj"));

            try {
                Object o = objectInputStream.readObject();
                Atlet atlet = (Atlet) o;

                Collections.sort(atletList, new ComparatorByPoints());
                System.out.println("Winner      - " + atletList.get(0) + "\n" + "Runner-up   - " + atletList.get(1) + "\n" + "Third Place - " + atletList.get(2));

                Atlet winner= atletList.get(0);

                FileWriter out = new FileWriter("winner.csv");
                out.write("Atletul "+winner.name+" din "+winner.countryid +" in varsta de "+winner.varsta +" ani"+" a castigat competita cu un scor de "+winner.getFinalTime() +"!");
                out.close();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
