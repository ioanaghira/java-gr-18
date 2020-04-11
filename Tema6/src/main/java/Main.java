
import java.util.*;
import java.util.stream.Collectors;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        ListPerson listperson = new ListPerson();

        listperson.addInPerson(new Person(1, "Ioana", 1.75, Optional.ofNullable("ioana@gmail.com")));
        listperson.addInPerson(new Person(2, "Crina", 1.76, Optional.ofNullable("crina@gmail.com")));
        listperson.addInPerson(new Person(3, "Maria", 1.55, Optional.ofNullable(null)));
        listperson.addInPerson(new Person(4, "Teodora", 1.74, Optional.ofNullable("teodora@gmail.com")));
        listperson.addInPerson(new Person(5, "Monica", 1.78, Optional.ofNullable("monica@gmail.com")));
        listperson.addInPerson(new Person(6, "Monica", 1.78, Optional.ofNullable("monica@gmail.com")));


        SetString setString = new SetString();

        setString.addInSet(setString.randomString());
        setString.addInSet(setString.randomString());
        setString.addInSet(setString.randomString());
        setString.addInSet(setString.randomString());
        setString.addInSet(setString.randomString());


        Map<String, Integer> mapInteger = new HashMap();

        mapInteger.put("a", 5);
        mapInteger.put("b", 2);
        mapInteger.put("c", 26);
        mapInteger.put("d", 1);
        mapInteger.put("e", 190);
        mapInteger.put("f", 9);


        System.out.println("2) Find the elements containing the letter \"a\" that start with \"M\" and print them out :");
        listperson.findElementInPerson("M", "a");
        System.out.println("........................................");

        System.out.println("3) Find the \"min\" using comparing criteria: height ");
        listperson.findMinPerson();
        System.out.println("........................................");

/**
 * compares two Strings lexicographically (alphabetical order) where z is max.

 */
        System.out.println("4) Generate 5 random Strings and add them to a Set. Find the \"max\" :");
        setString.findMax();
        System.out.println("........................................");

        System.out.println("7) Sort the above Set<String> (used for max) in reverse order");
        setString.reverseSet();
        System.out.println("........................................");

        System.out.println("5) Generate a random number of Integers (2-25) and then count them. \"Map\" the exponential  :");
        generateRandomInt(2, 25);
        System.out.println("........................................");

        System.out.println("6) Create a map of \"n\" (K,V) elements and print \"how many\" elements have value over 10 :");
        filterCountMap(mapInteger);
        System.out.println("........................................");

        System.out.println("8) Sort the above List of Person by height: ");
        listperson.sortedList();
        System.out.println("........................................");

        System.out.println("9) Check if any of your instances \"match\" a condition based on an Integer field (id=5) : ");
        listperson.match();
        System.out.println("........................................");
/**
 * Optional is the easiest way to deal with NullPointerException.
 * You could point to a null without getting the exception.
 */
        System.out.println("10) Optional isPresent and ifPresent: ");

//pointing to an empty email address-nothing bad happens.

        listperson.checkEmailIfPresent(2);
        listperson.checkEmailIsPresent(2);

        listperson.checkEmailIfPresent(3);
        System.out.println("........................................");

        System.out.println("11) Fastest way to find the shortest String in a List: ");
        setString.shortestString();
    }


    private static void generateRandomInt(int min, int max) {

        List<Integer> lista = new ArrayList<>();

        int num = new Random().ints(5, 20).findFirst().getAsInt();


        for (int i = 1; i <= num; i++) {

            Random randomInt = new Random();
            int random = randomInt.nextInt(i);

            lista.add(random);


        }
        System.out.println("Count int random generated :  " + lista.stream().count());
        System.out.println("Display list of random generated int : " + lista);


        List<Integer> newLista = lista.stream().map(x -> (int) Math.exp(x)).collect(Collectors.toList());
        System.out.println("Display mapped list :  " + newLista);
    }


    public static void filterCountMap(Map<String, Integer> map) {
        long result = map.entrySet().stream().filter(x -> x.getValue() > 10).count();

        System.out.println("Count of total element >10: " + result);


    }
}







