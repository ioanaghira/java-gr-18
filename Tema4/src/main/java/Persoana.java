import java.util.Comparator;

public class Persoana {

private String Name;
private int age;

    public Persoana(String name, int age) {
        Name = name;
        this.age = age;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return   Name + '\'' + age +" ani";
    }


}



