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

        Light bec3 = new Light(10);

        bec3.off();
        bec3.brighten();
        {
            System.out.println(bec3);
        }
    }
}
