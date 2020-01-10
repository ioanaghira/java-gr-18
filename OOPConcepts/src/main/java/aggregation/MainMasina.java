package aggregation;

public class MainMasina {

    public static void main(String[] args) {
        //masina VW de culoare alba cu motor Capacitate 1 si Putere 75
        //Afisam mesajul: Masina x are culoarea Y si motorul de putere Z si capacitate T

        Motor motorWV= new Motor();
        motorWV.setCapacitate(1);
        motorWV.setPutere(75);

        System.out.println("MotorWV are capacitate: " +motorWV.getCapacitate());
        System.out.println("MotorWV are puterea: " +motorWV.getPutere());

        Masina masinaWV= new Masina(motorWV,"WV");
        masinaWV.setCuloare("alb");
        System.out.println("Masina " +masinaWV.getNume()
                +"are culoarea" + masinaWV.getCuloare()
                + " si motorul de putere " + masinaWV.getMotor().getPutere()
                + " si capacitate: " + masinaWV.getMotor().getCapacitate());

masinaWV = null;
//chiar daca obiectul masina a fost distrus, obiectul motor exista Has a? Aggregation
    }
}
