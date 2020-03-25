import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.Optional;

@Setter
@Getter
@ToString



public class Person {

    private int id;
    private String name;
    private double height;
    private Optional<String> email;

    public Person(int id, String name, double height,Optional<String> email) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.email=email;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }
}




