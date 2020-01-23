package aggregation;

public class Masina {

    private String culoare;
    private String nume;
    private Motor motor;//contine clasa Motor


    //constructor
    public Masina(Motor motor, String nume) {
        this.culoare = "alb";
        this.nume = nume;
        this.motor =  motor;


    }

    public String getCuloare() {//click dreapta Generate: Getter and Setter
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}


