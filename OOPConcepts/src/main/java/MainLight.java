public class MainLight {
    public static void main(String[] args) {
        Light bec1 = new Light(5);//apelam constructorul
        bec1.on();
        bec1.off();
        bec1.dimen();
        bec1.brighten();

        Light bec2 = new Light(20);//apelam constructorul

        bec2.brighten();
        bec2.brighten();
        bec2.dimen();
    }
}
