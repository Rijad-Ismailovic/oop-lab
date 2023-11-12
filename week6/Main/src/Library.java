import java.util.ArrayList;

public class Library {
    private ArrayList<Book> list = new ArrayList<>();

    public void addBook(Book book){
        list.add(book);
    }
    public void printBooks(){
        for (Book book : list){
            System.out.println(book.title() + " " + book.publisher() + " " + book.year());
        }
    }
    public Book searchByTitle(String searchedTitle){
        for(Book book : list){
            if (book.title().equals(searchedTitle)){
                return book;
            }
        }
        return null;
    }
    public Book searchByPublisher(String searchedPublisher){
        for(Book book : list){
            if (book.publisher().equals(searchedPublisher)){
                return book;
            }
        }
        return null;
    }
    public Book searchByYear(int searchedYear){
        for(Book book : list){
            if (book.year() == searchedYear){
                return book;
            }
        }
        return null;
    }
}
