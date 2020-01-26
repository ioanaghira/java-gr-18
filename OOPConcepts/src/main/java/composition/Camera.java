package composition;

public class Camera {
    private String culoare;
    private int marime;

    //constructor
    public Camera() {

        this.culoare = "alb";
        this.marime = 10;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getMarime() {
        return marime;
    }

    public void setMarime(int marime) {
        this.marime = marime;
    }//e parte din cladire IS part of? si daca cladirea e distrusa e distrusa si camera
}
