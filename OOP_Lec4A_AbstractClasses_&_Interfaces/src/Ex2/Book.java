package Ex2;

public class Book implements Printable{

    private int bookId;
    private String bookName;
    private String author;

    public Book(int bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Book ID : " + this.bookId);
        System.out.println("Book Name : " + this.bookName);
        System.out.println("Author : " + this.author);
    }

}