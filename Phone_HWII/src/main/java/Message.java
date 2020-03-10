public class Message {
    String text;
    private final int countChar = 15;
    int count = 0;
    Contact contact;


    public Message(String text, Contact contact) {
        this.text = text;
        this.contact = contact;
    }

    public int getCountChar() {
        return countChar;
    }

    @Override
    public String toString() {
        return contact.numar + text;

    }

    public boolean countChar(boolean result) {
        int count = 0;


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ')
                count++;


            if (count < getCountChar()) {
                result = true;
            } else {
                result= false;

            }
        }
        return result;
    }
}












