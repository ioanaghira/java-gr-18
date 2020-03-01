import java.util.Arrays;

public class SamsungGalaxy6 extends Samsung {
    String color;
    String material;
    int imei;
    Contact[] listofContact = new Contact[0];
    Call[] listaCalls = new Call[0];
    Message[] listaMesaje = new Message[0];
    Message message;

    int newBatteryLife = getBatteryLife();


    public SamsungGalaxy6(String color, String material, int imei) {
        this.color = color;
        this.material = material;
        this.imei = imei;

    }

    @Override
    public Contact[] addContacts(Contact contactToAdd) {
        Contact[] newArray = Arrays.copyOf(listofContact, listofContact.length + 1);
        newArray[listofContact.length] = contactToAdd;
        listofContact = newArray;
        return listofContact;
    }


    @Override
    public void seeContacts() {
        for (Contact contact : listofContact) {
            if (contact != null) {
                System.out.println(contact.ctrl + " " + contact.numar + " " + contact.firstName + " " + contact.lastName);
            }

        }
    }

    @Override
    public void sendMessage(Message mesajToAdd) {
        if (!mesajToAdd.countChar(true)) {
            System.out.println("Message too long...");
        } else {
            if (newBatteryLife < 1) {
                System.out.println("baterie descarcata" +"nivel ramas " +newBatteryLife+ " h");
            } else {

                Message[] newArray = Arrays.copyOf(listaMesaje, listaMesaje.length + 1);
                newArray[listaMesaje.length] = mesajToAdd;
                listaMesaje = newArray;
                newBatteryLife = newBatteryLife - 1;
                System.out.println("Texting..."+mesajToAdd.contact);

            }

        }
    }

    @Override
    public void seeMessages() {

        for (Message mesaj : listaMesaje) {
            if (mesaj != null) {
                System.out.println("Istoric mesaje : " + mesaj.contact.numar + " " + mesaj.text);


            }

        }
    }



    @Override
    public void call(Call callToAdd) {

        if (newBatteryLife >= 2) {
            Call[] newArray = Arrays.copyOf(listaCalls, listaCalls.length + 1);
            newArray[listaCalls.length] = callToAdd;
            listaCalls = newArray;
            newBatteryLife = newBatteryLife - 2;
            System.out.println("Calling..."+callToAdd.contact);

        } else {
            System.out.println("baterie descarcata "+"nivel ramas " +newBatteryLife+ "h");
        }
    }

    @Override
    public void seeCallHistory() {
        for (Call call : listaCalls) {
            if (call != null) {
                System.out.println("Istoric apeluri : " + call.contact.numar);

            }
        }
    }
}









