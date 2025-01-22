package week_6;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books= new ArrayList<>();
    }
    public void addBook(Book newBook) {
        books.add(newBook);
    }
    public void printBooks() {
        for(Book book : books) {
                System.out.println(book.toString());
        }
    }
}
