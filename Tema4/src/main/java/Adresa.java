
import java.util.Objects;

public class Adresa {
    String country;

    public Adresa(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return  country;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresa adresa = (Adresa) o;
        return Objects.equals(country, adresa.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country);
    }
}
