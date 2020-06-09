public class Call {

    Contact contact;

    public Call(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return contact.numar;

    }
}
