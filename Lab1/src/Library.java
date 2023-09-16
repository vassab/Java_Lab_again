import java.util.AbstractList;
import java.util.ArrayList;

public class Library {

    private String _nameLibrary;
    private ArrayList<Book> _allBooks = new ArrayList<Book>();

    //Construction
    public Library() {
        _nameLibrary = "School Library";
    }

    public  Library(String name) {
        _nameLibrary = name;
    }
    //


    public void addBook(Book book) {
        _allBooks.add(book);
    }

    public void displayAllBooks() {
        System.out.println(_nameLibrary + " have this books:");

        for (Book book : _allBooks) {
            displayBook(book);
        }
    }

    public  void displayBook(Book book) {
        System.out.println("Name: " + book.name);
        System.out.println("Author: " + book.author);
        System.out.println("ISBN:" + book.ISBN);
        System.out.println("Publication Year:" + book.yearPublication);

        System.out.println();
    }

    public void findBookAtName (String name){

        boolean goodFind = false;

        for (Book book : _allBooks) {
            if (book.name.equals(name)) {
                System.out.println();
                displayBook(book);

                goodFind = true;
                break;
            }
        }

        if(!goodFind) System.out.println("Library don't have this book.");
    }

    public void removeBookAtISBN (String ISBN){
        boolean removeBool = false;

        for (int i = 0; i <  _allBooks.size(); i++) {
            if (_allBooks.get(i).ISBN.equals(ISBN)) {
                _allBooks.remove(i);
                removeBool = true;
                break;
            }
        }

        if(removeBool) System.out.println("Book was removed.");
        else System.out.println("Library don't have this book.");

        System.out.println();
    }
}
