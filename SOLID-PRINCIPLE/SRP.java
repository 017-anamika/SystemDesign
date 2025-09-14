/*A class should have only one reason to change.*/
class Book {
    String title, author;
    Book(String t, String a) { title = t; author = a; }
}

class BookRepository {
    void save(Book b) {
        System.out.println("Saving book: " + b.title);
    }
}

class BookPrinter {
    void print(Book b) {
        System.out.println("Book: " + b.title + " by " + b.author);
    }
}

public class SRPDemo {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "Anamika");
        new BookRepository().save(b);
        new BookPrinter().print(b);
    }
}
