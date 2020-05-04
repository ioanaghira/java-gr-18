

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new SamsungGalaxy6("red", "steel", 1504);

        Contact contact1 = new Contact(1, "0749904451", "Teodora", "Pop");
        Contact contact2 = new Contact(1, "0749563657", "Ioana", "Albescu");

        Call call1 = new Call(contact2);
        Call call2 = new Call(contact1);
        Call call3 = new Call(contact1);

        Message mesaj1 = new Message(" 'Vin'", contact1);
        Message mesaj2 = new Message(" Testam lungimea mesajului ", contact1);//lungimea maxima a mesajului a fost setata la 15 char pentru a fi mai usor de testat
        Message mesaj3 = new Message(" 'Am plecat'", contact1);


        phone1.addContacts(contact1);
        phone1.addContacts(contact2);
        phone1.seeContacts();

        phone1.sendMessage(mesaj1);
        phone1.sendMessage(mesaj2);
        phone1.seeMessages();

        phone1.call(call1);
        phone1.seeCallHistory();
        phone1.call(call2);

        phone1.sendMessage(mesaj3);
        phone1.seeMessages();


        Phone phone2 = new IphoneXS("white", "glass", 5468);

        Phone phone3 = new Iphone6("blue", "glass", 5624);

        Phone phone4 = new SamsungA50("grey", "iron", 5648);
    }
}