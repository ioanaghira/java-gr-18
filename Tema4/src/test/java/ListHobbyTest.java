
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;



class ListHobbyTest {


    @Test
    void should_AddNewSquareInDrawingTool_isValid() {


        // GIVEN
        List<Hobby> listaHobby = new ArrayList<Hobby>();
        List<Adresa> adresa1 = new ArrayList<Adresa>();
        Hobby hobby1 = new Hobby("ciclism", 3,adresa1);

        // WHEN
        listaHobby.add(hobby1);

        // THEN

        assertEquals(1, listaHobby.size());
    }


}
