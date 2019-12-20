public class Person {
    String name;  //attribute or instance value
    int age;

    //constructor implicit
    public Person(){

        this.name = "no name";
        System.out.println("Constructorul implicit a fost apelat");


    }
    //constructor explicit
    public Person(String name) {
        System.out.println("Constructorul explicit cu 1 parametru a fost apelat");
        this.name = name;
        displayHello();

    }
    public void displayHello(){
        System.out.println("Hello dear " + this.name);

    }
}
