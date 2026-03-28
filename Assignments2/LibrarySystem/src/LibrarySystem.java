class Book {
    int bookId;
    String bookName;

    Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    void displayBook(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
    }

}

class Library {
    Book [] book;

    void displayBooks(Book [] book) {
        for (int i = 0; i < book.length; i++) {
            book[i].displayBook();
        }
    }

}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programming");
        Book b2 = new Book(102, "Data Structures");
        Book b3 = new Book(103, "Operating System");

        Library l = new Library();

        Book [] b = {b1, b2, b3};

        l.displayBooks(b);

    }
}
