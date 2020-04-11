import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListPerson {

    List<Person> personList = new ArrayList<Person>();


    public void addInPerson(Person newPerson) {


        personList.add(newPerson);


    }

    public void seeListPerson() {
        for (Person newPerson : personList) {
            if (newPerson != null) {
                System.out.println(newPerson);
            }

        }

    }


    @Override
    public String toString() {
        return "personList: " + personList;
    }


    public void findElementInPerson(String startwith, String contains) {
       System.out.println(personList.stream().map(Person::getName).filter(x -> x.startsWith(startwith)).filter(x -> x.contains(contains)).collect(Collectors.toSet()));


    }

    public void findMinPerson() {
        Person min = personList.stream().min(Comparator.comparing(Person::getHeight)).get();
        System.out.println(min);
    }

    public void sortedList() {
        personList.stream().sorted(Comparator.comparingDouble(Person::getHeight)).collect(Collectors.toList()).forEach(System.out::println);
    }

    public void match() {
        boolean result = personList.stream().anyMatch(x -> x.getId() == 5);

        System.out.println(result);

    }

    public void checkEmailIfPresent(int i) {
        personList.get(i).getEmail().ifPresent(e -> System.out.println(personList.get(i).getName() + "'s email is: " + e));
    }

    public void checkEmailIsPresent(int i) {
        System.out.println(personList.get(i).getEmail().isPresent());

    }


}

