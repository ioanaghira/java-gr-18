public class MainDreptunghi {

    public static void main(String[] args) {
        Dreptunghi dreptunghiA = new Dreptunghi(20.0,10.0);
        System.out.println("Aria obiect dreptunghiA este : " +dreptunghiA.getArie());
        System.out.println("Perimetrul obiect dreptunghiA este : " +dreptunghiA.getPerimeter());

    Dreptunghi dreptunghiB = new Dreptunghi(40.0,40.0);

        System.out.println("Diagonala obiect dreptunghiB este : " +dreptunghiB.getDiagonala());



}

    public static class Dreptunghi {

        private double lungime;
        private double latime;

        public Dreptunghi(double lungime, double latime) {//constructor

            this.latime = latime;
            this.lungime = lungime;
        }

        public double getArie() {//metode

            return lungime * latime;
        }

        public double getPerimeter() {

            return 2 * (lungime + latime);
        }

        public double getDiagonala() {

            return Math.sqrt(lungime*lungime +latime*latime);//sqrt- o metoda statica e apelata cu numele clasei
        }
    }
}
