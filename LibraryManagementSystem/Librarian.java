package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Librarian extends User implements LibraryOperations {
    private List<Book> libraryBooks;

    public Librarian(String name, String userId) {
        super(name, userId);
        this.libraryBooks = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Librarian Name: " + getName() + ", User ID: " + getUserId());
    }

    public void addBook(Book book) {
        libraryBooks.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(Book book) {
        if (libraryBooks.remove(book)) {
            System.out.println("Book removed: " + book.getTitle());
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Librarians don't borrow books.");
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Librarians don't return books.");
    }
}