package aggregation;

public class Motor {
    private int putere;
    private double capacitate;

    public Motor() {//constructor
        this.capacitate = 75;
        this.putere = 1;
    }

    public int getPutere() {//returneaza
        return putere;
    }

    public void setPutere(int putere) {//seteaza
        if (putere < 75) {
            System.out.println("Nu puteti seta valoare mai mica decat 75 pentru capacitate");
        } else {
            this.putere = putere;
        }
    }

    public double getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(double capacitate) {
        if (capacitate < 0.8) {
            System.out.println("Nu puteti seta valoare mai mica decat 0.8 pentru capacitate");
        } else {

            this.capacitate = capacitate;
        }
    }
}


