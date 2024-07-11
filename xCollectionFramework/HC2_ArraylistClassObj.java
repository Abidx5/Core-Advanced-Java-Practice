package xCollectionFramework;


import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

class MyBooks{
    private String name;
    private String author;
    private String isbn;

    MyBooks(String name, String author,String isbn){
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
    @Override
    public String toString(){
        return "BookName = "+ name + " Author = "+author + " Isbn = "+ isbn;
    }
}

public class HC2_ArraylistClassObj {
    public static void main(String[] args) {
        //ArrayList myBookList = new ArrayList<>();
        List<MyBooks> myBookList = new ArrayList<>();

        MyBooks book1 = new MyBooks ("Java basic","Abid Hassan","H1202");
        MyBooks  book2 = new MyBooks ("The Lean StartUp","Potel Nab","T1222");


        myBookList.add(book1);
        myBookList.add(book2);
        myBookList.add(new MyBooks ("Computer Basics","Nicol Bons","H7377"));

         // to remove a book
       // Book bookToRemove = library.get(1); // Removing the second book
       myBookList.remove(myBookList.get(1));

        System.out.println("Books in the list are:");
        for (MyBooks book : myBookList) {
            System.out.println(book);
        }

    }
}
