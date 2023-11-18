package task2;

public class Main {
    public static void main(String[] args){
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        libraryCatalog.addBook(new Book("Dervis i smrt", "Mesa Selimovic", 1000, true));
        libraryCatalog.addBook(new Book("Stranac", "Albert Camus", 1000, false));
        libraryCatalog.addBook(new Book("Ponornica", "Skender Kulenovic", 1000, true));
        
        System.out.println(libraryCatalog.checkBookAvailability("dervis i smrt"));
        System.out.println(libraryCatalog.checkBookAvailability("na drini cuprija"));

        System.out.println(libraryCatalog.getFirstAvailableBookByAuthor("Mesa selimovic"));
        System.out.println(libraryCatalog.getFirstAvailableBookByAuthor("Ivo andric"));

        System.out.println(libraryCatalog.checkBookAvailability("stranac"));
        libraryCatalog.updateAvailability("Stranac", true);
        System.out.println(libraryCatalog.checkBookAvailability("stranac"));
    }
}
