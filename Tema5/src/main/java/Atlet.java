import java.io.Serializable;

public class Atlet implements Serializable {
    public int id;
    public String name;
    public String countryid;
    public double time;
    public String shoot1;
    public String shoot2;
    public String shoot3;
    public int varsta;
    public String concatshoot = shoot1 + shoot2 + shoot3;

    public Atlet(int id, String name, String countryid, double time, String shoot1, String shoot2, String shoot3,int varsta) {
        this.id = id;
        this.name = name;
        this.countryid = countryid;
        this.time = time;
        this.shoot1 = shoot1;
        this.shoot2 = shoot2;
        this.shoot3 = shoot3;
        this.varsta = varsta;
    }


    public int penalty() {
        int penalty = 0;
        String concatshoot = shoot1 + shoot2 + shoot3;
        for (int i = 0; i < concatshoot.length(); i++) {

            if (concatshoot.charAt(i) == 'o') {
                penalty = penalty + 10;


            }
        }

        return penalty;
    }

    public double getFinalTime() {

        return time + penalty() / 10;
    }


    @Override
    public String toString() {
        return name + " "  +getFinalTime() + " (" + time + "+" + penalty() + ")";
    }


}


