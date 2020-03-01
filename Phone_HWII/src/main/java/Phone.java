public interface Phone {



    Contact[] addContacts(Contact contactToAdd); //you can create new contacts

    void seeContacts();//you can see existing contacts

    void sendMessage(Message mesajToAdd);//you can send a text message

    void seeMessages();//you can see all messages for a specific contact

    void call(Call callToAdd);       //you can make a call

    void seeCallHistory();//you can see all calls history
}
