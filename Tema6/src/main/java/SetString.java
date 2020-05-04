import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetString {

    Set<String> setRandom = new HashSet<>();

    public String randomString() {
        final String alphaCharacters = "abcdefghijklmnopqrstuvwxyz";

        String randomString1 = "";


        Random rand = new Random();
        int length = rand.nextInt(alphaCharacters.length());
        char[] text = new char[length];

        for (int i = 0; i < length; i++) {
            text[i] = alphaCharacters.charAt(rand.nextInt(alphaCharacters.length()));

        }
        for (int i = 0; i < text.length; i++) {
            randomString1 += text[i];
        }


        return randomString1;

    }

    public void addInSet(String randomString) {


        setRandom.add(randomString);


    }

    public void findMax() {
        String Max = setRandom.stream().max(Comparator.comparing(String::valueOf)).get();
        System.out.println("Maximum element is:" + Max);
    }

    public void reverseSet() {
        setRandom.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public void shortestString() {
        System.out.println(setRandom.stream().sorted(Comparator.comparing(String::length)).findFirst());
    }

}
