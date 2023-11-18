package task2;
import java.util.ArrayList;
import java.util.Optional;

public class LibraryCatalog {
    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book){
        this.bookList.add(book);
    }

    public boolean checkBookAvailability(String title){
        return bookList.stream()
            .anyMatch(book -> book.title().equalsIgnoreCase(title) && book.availabilityStatus());
    }

    public Optional<Book> getFirstAvailableBookByAuthor(String author){
        return bookList.stream()
            .filter(book -> book.author().equalsIgnoreCase(author))
            .findFirst();
    }

    public void updateAvailability(String title, boolean newAvailability){
        Optional<Book> optionalBook = bookList.stream()
                                        .filter(book -> book.title().equalsIgnoreCase(title))
                                        .findFirst();
        if(optionalBook.isPresent()){
            Book book = optionalBook.get();
            bookList.remove(book);
            bookList.add(new Book(book.title(), book.author(), book.publicationYear(), newAvailability));
            System.out.println("Status changed succesfully");
        } else{
            System.out.println("Book doesnt exist");
        }
    }
}
