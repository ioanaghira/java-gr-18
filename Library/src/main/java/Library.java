import java.util.Arrays;


public class Library {

    private Book[] listaCarti;

    //constructor pentru Librarie

    public Library() {
        listaCarti = new Book[0];
    }


    public void listBooks() {
        for (Book book : listaCarti) {
            if (book != null) {
                System.out.println(book.getName());
            }
        }
    }


    public Book[] add(Book bookToAdd) {
        //pas1 cream un nou array cu dimensiunea lui= vechiul array +1
        Book[] newArray = Arrays.copyOf(listaCarti, listaCarti.length + 1);
        //pas2 in noul array adaugam pe ultima pozitie noul element
        newArray[listaCarti.length] = bookToAdd;
        listaCarti = newArray;
        return listaCarti;
    }


    public Book[] remove(int index) {
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (listaCarti == null
                || index < 0
                || index >= listaCarti.length) {
            return listaCarti;
        }
        // Create another array of size one less
        Book[] anotherArray = new Book[listaCarti.length - 1];
        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < listaCarti.length; i++) {
            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = listaCarti[i];
        }

        listaCarti = anotherArray;

        // return the resultant array

        return listaCarti;
    }
}