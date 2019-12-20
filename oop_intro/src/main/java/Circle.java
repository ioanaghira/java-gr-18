public class Circle {

    //variabile de instante
    public static final double PI = 3.14; //constanta
    double radius;
    String color;

    //constructor
    public Circle(double radius, String color) {
     this.radius = radius; //ia variabila clasei cu this nu a metodei
     this.color = color;

    }
    //metode
    public double getAria() {
       return PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * PI *radius;
    }

    @Override //sa nu ne afiseze locatia obiectlui din Heap ci obiectul cu atribute
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';

}
}
