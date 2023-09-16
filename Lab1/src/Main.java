public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("C# для чайников", "Righter", "1434563", "2019"));
        library.addBook(new Book("C# для продвинутих", "Righter", "1434564", "2022"));
        library.addBook(new Book("Кобзар", "Шевченко", "1446563", "2015"));
        library.addBook(new Book("Вій", "Гоголь", "1434546", "2022"));

        library.displayAllBooks();


        System.out.println("Test find at name: ");
        library.findBookAtName("C# для богів і не тільки");
        library.findBookAtName("Вій");

        System.out.println("Test remove at ISBN: ");
        library.removeBookAtISBN("253564");
        library.removeBookAtISBN("1434564");
        library.displayAllBooks();
    }
}

