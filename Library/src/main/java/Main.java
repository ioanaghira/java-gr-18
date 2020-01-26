

public class Main {

    public static void main(String[] args) {

        Library librarie1 = new Library();
        Book[] listaCarti = new Book[0];

        Novel book1 = new Novel();
        book1.setName("Novel1");
        book1.setPage(200);
        book1.setType("drama");

        Novel book2 = new Novel();
        book2.setName("Novel2");
        book2.setPage(150);
        book2.setType("mister");

        Album book3 = new Album();
        book3.setName("Album1");
        book3.setPage(100);
        book3.setQuality("foarte buna");

        Album book4 = new Album();
        book4.setName("Album2");
        book4.setPage(300);
        book4.setQuality("buna");


        librarie1.add(book1);
        librarie1.add(book2);
        librarie1.add(book3);
        librarie1.add(book4);

        librarie1.remove(2);//remove Album1

        librarie1.listBooks();


    }
}





