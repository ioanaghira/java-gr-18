public class Novel extends Book {
    private String type;


    //metode


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "type='" + type + '\'' +
                '}';
    }
}