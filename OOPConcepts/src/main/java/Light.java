public class Light { //clasa de baza
    //attributes

    //constante

    public static final int MAX = 100;
    public static final int MIN = 0;
    private int step;//stepul cu care crestem intensitatea// private doar pentru logica mea interna
    private int intensitateaCurenta;


    //Constructor are ca si atribut step
    public Light(int step){ //var locala
        this.step = step; //punem this si ia atribulul clasei nu metodei
        this.intensitateaCurenta = 0;

    }

    //methods
    public void on() {
        System.out.println("Intensitatea becului este: " +MAX);
        this.step = MAX;

    }

    public void off() {
        System.out.println("Becul este stins");
        this.step=  MIN;
    }

    public void brighten(){
        if (intensitateaCurenta + step < MAX){
            intensitateaCurenta= intensitateaCurenta + step;
            System.out.println("Intensitatea curenta a becului este " +intensitateaCurenta);

        } else {System.out.println("Nu se mai poate creste intensitatea");
        }

    }
    public void dimen(){
        if (intensitateaCurenta - step > MIN){
            intensitateaCurenta= intensitateaCurenta - step;
            System.out.println("Intensitatea curenta a becului este " +intensitateaCurenta);
        } else {System.out.println("Becul este stins");
        }


    }
}
