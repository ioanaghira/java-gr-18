package loopexamples;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = {10, 20, 30, 40, 50};
        afisareElemArray(arrayInt);

        sumaNrArray(arrayInt);

        int numar = 1501;
        inversareNumar(numar);
        //afisare caractere unui string
        //afisare nr de vocale din string

        String propozitie = "Ana are mere";
        char[] arrayCaractere = propozitie.toCharArray();

        int nrVocale = 0;

        for (char element : arrayCaractere) {

        System.out.println(element);
        if (element == 'a' || element == 'e' || element == '0' || element == 'u') {
            nrVocale++;
        }
    }
        System.out.println("Nr vocale din string e: " + nrVocale);
    }

    private static void inversareNumar(int numar) {
        int numarInversat = 0;
        while (numar > 0) {


            numarInversat = numarInversat * 10 + numar % 10;
            numar = numar / 10;
        }
        System.out.println("numar inversat este: " + numarInversat);
    }

    private static void afisareElemArray(int[] arrayInt) {
        //afisare element array
        for (int elem : arrayInt) {
            System.out.println(elem);
        }
    }

    private static void sumaNrArray(int[] arrayInt) {
        //calculeaza suma in functie de niste conditii
        //daca elementul din array == 30 nu se va calcula suma
        // daca suma depaseste 100 se intrerupe executia arrayului

        int suma = 0;

        for (int elem : arrayInt) {
            if (elem == 30) {
                continue;
            }
            if (suma > 100) {
                break;
            }

            suma = suma + elem;
            System.out.println("element: " + elem + "suma: " + suma);
        }
        System.out.println("Am iesit din bucla. suma finala este:" + suma);
    }
}
