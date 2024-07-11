package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Member extends User implements LibraryOperations {
    private List<Book> borrowedBooks;                  //check

    public Member(String name, String userId) {
        super(name, userId);
        this.borrowedBooks = new ArrayList<>();                // check
    }

    @Override
    public void displayInfo() {
        System.out.println("Member Name: " + getName() + ", User ID: " + getUserId());
    }

    @Override
    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {   //check
            borrowedBooks.add(book);
            book.setBorrowed(true);
            System.out.println(getName() + " borrowed " + book.getTitle());  //get title
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    @Override
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {  //check
            book.setBorrowed(false);
            System.out.println(getName() + " returned " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by " + getName());
        }
    }
}