public class Contact {

    int ctrl;
    String firstName;
    String lastName;
    String numar;

    public Contact(int ctrl, String numar, String firstName, String lastName) {
        this.ctrl = ctrl;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numar = numar;
    }

    @Override
    public String toString() {
        return  firstName;

    }
}

