import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class AtletReaderCSV {

    List<Atlet> readAtlet(String fileName) {
        List<Atlet> atleti = new ArrayList<>();


        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(fileName));

            String line = bufferedReader.readLine();

            while (line != null) {
                String[] tokens = line.split(",");

                Atlet atlet = new Atlet(
                        Integer.parseInt(tokens[0]),
                        tokens[1],
                        tokens[2],
                        Double.parseDouble(tokens[3]),
                        tokens[4],
                        tokens[5],
                        tokens[6],
                        Integer.parseInt(tokens[7])

                );

                atleti.add(atlet);

                line = bufferedReader.readLine();

            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        return atleti;
    }
}
