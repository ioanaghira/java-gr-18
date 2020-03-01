import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PersoanaTest {


    @Test
    public void shouldCreatePersonaAndReturnName() {
        //Given
        String name = "Ioana";
        int age = 15;

        //When

        Persoana persona1 = new Persoana(name, age);

        //Then

        Assert.assertTrue(persona1.getName().equals(name));


    }
}