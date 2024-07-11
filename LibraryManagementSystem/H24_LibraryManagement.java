package LibraryManagementSystem;


public class H24_LibraryManagement {
    public static void main(String[] args) {


        Member member = new Member("Abid Hassan", "M001");
        Member member2 =new Member("Sagor Sarkar","M002");
        Librarian librarian = new Librarian("Rifat farazi", "L001");


        Book book1 = new Book("Java Programming Language", "John Author", "ISBN123");
        Book book2 = new Book("Effective Java", "Josh Bome", "ISBN456");
        Book book3 = new Book("Java Boss","Mr Karan","ISBN456");

        librarian.addBook(book1);
        librarian.addBook(book2);
        librarian.addBook(book3);
        System.out.println(" Display info of member----");
        member.displayInfo();
        member2.displayInfo();
        System.out.println(" Display info of librarian---");
        librarian.displayInfo();

        member.borrowBook(book1);
        member.borrowBook(book2);// Trying to borrow a second book

        member.returnBook(book1);

        member2.borrowBook(book3);

        member.borrowBook(book2); // Now should be able to borrow

        librarian.removeBook(book1);
    }
}